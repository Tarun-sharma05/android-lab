package com.tarun.androidlab.demos.networking.ktor.Product_App.presentation.viewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tarun.androidlab.demos.networking.ktor.Product_App.Data.DTO.ProductDTO
import com.tarun.androidlab.demos.networking.ktor.Product_App.Data.Remote.ktorClient
import com.tarun.androidlab.demos.networking.ktor.Product_App.Data.Remote.productApiService
import com.tarun.androidlab.demos.networking.ktor.Product_App.Data.Repository.productRepositoryImpl
import com.tarun.androidlab.demos.networking.ktor.Product_App.Domain.Repository.productRepository
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {

    private val repository: productRepository =
        productRepositoryImpl(apiService =
            productApiService(ktorClient.client))


    var isLoading by mutableStateOf(false)
        private set
    var errorMessage by mutableStateOf<String?>(null)
        private set
    var success by mutableStateOf<List<ProductDTO>>(emptyList())
        private set



    var categories by mutableStateOf<List<String>>(listOf("All"))
        private set

    var salectedCategory by mutableStateOf("All")
        private set

    private var allProducts: List<ProductDTO> = emptyList()



    fun fetchProducts() {
        isLoading = true

        errorMessage = null

        viewModelScope.launch {
            try {
                val result = repository.getAllProducts()
                allProducts = result

                val category = result.map { it.category }.distinct().sorted()
                categories = listOf("All") + category

                applyFilters()
            }catch (e: Exception){
                errorMessage = e.message?: "An Unexpected error occurred."
            }
            finally {
                isLoading  = false
            }


            }

        }

    fun  onCategorySalected(category: String){
        salectedCategory = category
        applyFilters()
    }

    private fun applyFilters(){
        success = if (salectedCategory == "All") allProducts
        else allProducts.filter {
            it.category == salectedCategory
        }
    }
}