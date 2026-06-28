# Interview Question Bank
### For Tarun — verbal drills + implementation prompts, basic → advanced

> **How to use:**
> - Verbal questions: say the answer out loud, not in your head. Record yourself if needed.
> - Implementation prompts: open a blank file, write it, no AI, no docs.
> - Can't answer → study it → come back in 2 days → try again.
> - Tick a box only when you can answer cold, without hesitation.

---

## SECTION 0 — Kotlin Language

### Basic
- [ ] What is null safety? What problem does it solve compared to Java?
- [ ] What is the difference between `?.`, `?:`, and `!!`? When would you use each?
- [ ] What is a `data class`? What do you get automatically that you don't get in a regular class?
- [ ] What is the difference between `val` and `var`?
- [ ] What is string interpolation? Write an example.
- [ ] What are named arguments and default parameters? Write a function using both.
- [ ] What is the difference between `==` and `===` in Kotlin?
- [ ] What is a companion object? How is it different from a static method in Java?

### Intermediate
- [ ] Explain `let`, `run`, `with`, `apply`, `also`. When do you choose each?
- [ ] What is a sealed class? When is it better than an enum?
- [ ] What is an extension function? Write one that adds a `toTitleCase()` method to String.
- [ ] What is `by lazy`? When would you use it vs initializing eagerly?
- [ ] What is the difference between `List`, `MutableList`, `Array`?
- [ ] Explain `map`, `filter`, `fold`, `reduce`, `groupBy`, `partition`, `associateBy` — one sentence each.
- [ ] What is a higher-order function? Write one from scratch.
- [ ] What is a lambda? Write a lambda that takes an Int and returns whether it's even.
- [ ] What is an inline function? Why does Kotlin have them?
- [ ] What is destructuring? Give an example with a data class.
- [ ] What is `when` used for? How is it different from Java's `switch`?

### Advanced
- [ ] What is variance in generics? Explain `in` (contravariance) and `out` (covariance) with examples.
- [ ] What is a reified type parameter? Why is it needed?
- [ ] What is the `by` keyword for delegation? Write a custom delegate.
- [ ] What is the difference between `object` declaration, `companion object`, and `object` expression?
- [ ] What is `typealias`? When is it useful?
- [ ] What is operator overloading? Write an example.

---

## SECTION 1 — OOP in Kotlin

### Basic (four pillars)
- [ ] What is **encapsulation**? Give an example in Kotlin.
- [ ] What is **inheritance**? How do you inherit a class in Kotlin? (hint: `open`)
- [ ] What is **polymorphism**? Give an example.
- [ ] What is **abstraction**? What is the difference between an `abstract class` and an `interface`?

### Intermediate
- [ ] In Kotlin, why do you have to mark a class `open` to inherit from it?
- [ ] What is the difference between `abstract class` and `interface` in Kotlin?
- [ ] Can a Kotlin class implement multiple interfaces? Can it extend multiple classes?
- [ ] What is `override`? What happens if you don't mark a function `open` and try to override it?
- [ ] What is exception handling? Write a try-catch-finally block.
- [ ] What is the difference between a checked and unchecked exception? Does Kotlin have checked exceptions?

---

## SECTION 2 — Coroutines & Flow

### Basic
- [ ] What is a coroutine? How is it different from a thread?
- [ ] What does `suspend` mean? Can you call a suspend function from a normal function?
- [ ] What is the difference between `launch` and `async`?
- [ ] What are Dispatchers? Name them and say when you use each.
- [ ] What is `viewModelScope`? Why is it used in a ViewModel?
- [ ] What happens when a ViewModel is cleared — what happens to its coroutines?

### Intermediate
- [ ] What is structured concurrency? Why does it matter?
- [ ] What is `withContext`? When do you use it vs `launch`?
- [ ] How do you handle exceptions in coroutines? What is `CoroutineExceptionHandler`?
- [ ] What is `supervisorScope`? How does it differ from `coroutineScope`?
- [ ] What is a Flow? How is it different from a suspend function returning a value?
- [ ] What is the difference between `StateFlow` and `SharedFlow`?
- [ ] What is `collectAsStateWithLifecycle`? Why is it preferred over `collectAsState`?
- [ ] What is `stateIn`? When do you use it?

### Advanced
- [ ] What are `combine`, `flatMapLatest`, `debounce`, `distinctUntilChanged`? Use case for each.
- [ ] What is `callbackFlow`? When would you use it?
- [ ] What is `channelFlow`? How does it differ from `flow {}`?
- [ ] What is cold vs hot flow?
- [ ] How do you cancel a coroutine? What is a cancellation exception?

---

## SECTION 3 — Jetpack Compose

### Basic
- [ ] What is a Composable function? What makes it different from a regular function?
- [ ] What is recomposition? When does it happen?
- [ ] What is `remember`? What problem does it solve?
- [ ] What is the difference between `remember` and `rememberSaveable`?
- [ ] What is state hoisting? Why is it useful?
- [ ] What is `mutableStateOf`?

### Intermediate
- [ ] What is `derivedStateOf`? When do you use it?
- [ ] Why does modifier order matter in Compose? Give an example where order changes the result.
- [ ] What is `LaunchedEffect`? When do you use it?
- [ ] What is `DisposableEffect`? Give a use case.
- [ ] What is `SideEffect`? When would you use it?
- [ ] What is the difference between `LazyColumn` and `Column`?
- [ ] What is the `key` parameter in `LazyColumn`? Why does it matter for performance?
- [ ] What is `LazyVerticalGrid`? Write a 2-column grid from scratch.

### Advanced
- [ ] What is `CompositionLocal`? When is it appropriate to use?
- [ ] What is a custom `Layout` composable? When would you write one?
- [ ] What is `Modifier.composed`?
- [ ] How does Compose handle process death? What is `rememberSaveable` with a `Saver`?
- [ ] What are stability annotations (`@Stable`, `@Immutable`)? Why do they affect performance?

---

## SECTION 4 — Architecture

### Basic
- [ ] What is MVVM? Draw the data flow: UI → ViewModel → Repository → Data Source
- [ ] What is the role of a ViewModel? Why does it survive configuration changes?
- [ ] What is a Repository? What problem does it solve?
- [ ] What is the difference between a ViewModel and a plain class that holds state?

### Intermediate
- [ ] What is Clean Architecture? Name the layers and the dependency rule.
- [ ] Why should the domain layer have no Android imports?
- [ ] What is a UseCase / Interactor? When do you add one vs call the repository directly?
- [ ] What is MVI? How does it differ from MVVM?
- [ ] What is unidirectional data flow (UDF)?
- [ ] What is the difference between `StateFlow` and `LiveData`? Which do you prefer and why?
- [ ] What is dependency injection? Why use it?
- [ ] What is the difference between Hilt and Koin?

### Advanced
- [ ] What is the single source of truth principle?
- [ ] How do you handle errors across layers (domain error vs network error vs UI error)?
- [ ] What is a sealed class UI state pattern? Write Loading/Success/Error from blank.
- [ ] How do you handle process death end-to-end in an MVI app?

---

## SECTION 5 — Networking & APIs

### HTTP Fundamentals (verbal — interviewers ask these)
- [ ] What is REST? What makes an API RESTful?
- [ ] What do these HTTP methods do: GET, POST, PUT, PATCH, DELETE?
- [ ] What do these status codes mean: 200, 201, 400, 401, 403, 404, 500?
- [ ] What is a request header? What is a Bearer token?
- [ ] What is the difference between query params and path params?
- [ ] What is JSON? What is serialization/deserialization?

### Retrofit
- [ ] Write a Retrofit instance with OkHttp, logging interceptor, and base URL from blank.
- [ ] Write an API interface with @GET, @POST, @Path, @Query, @Body from blank.
- [ ] How do you attach an auth token to every request? (OkHttp interceptor)
- [ ] What is a suspend function in a Retrofit interface? How does it differ from a Call?

### Ktor
- [ ] Write a Ktor HttpClient with JSON serialization and logging from blank.
- [ ] Write a GET request and a POST request with Ktor.
- [ ] How do you add a default header to all Ktor requests?
- [ ] What is the difference between Retrofit and Ktor? When would you choose Ktor?

### Error Handling
- [ ] How do you map network errors (timeout, 401, 500) to domain errors?
- [ ] What is a Result/sealed wrapper? Write one from blank.
- [ ] What is the JWT refresh-token flow? Explain step by step.
- [ ] How do you auto-refresh a JWT token on a 401 and retry the original request?

---

## SECTION 6 — Authentication

- [ ] What is the difference between authentication and authorization?
- [ ] What is JWT? What are the three parts of a JWT token?
- [ ] What is an access token vs a refresh token? What are typical expiry times?
- [ ] What is OAuth 2.0? What is the difference between OAuth and OIDC?
- [ ] How does Google Sign-In work on Android (Credential Manager API)?
- [ ] How do you store tokens securely on Android? (EncryptedSharedPreferences / DataStore)
- [ ] What is session management? How do you handle logout?

---

## SECTION 7 — Local Persistence

- [ ] What is Room? What are entities, DAOs, and the database?
- [ ] Write a Room entity + DAO with insert, delete, and a query from blank.
- [ ] What is the difference between Room and SQLite directly?
- [ ] What is a database migration? Why is it needed?
- [ ] What is DataStore? What is the difference between Preferences DataStore and Proto DataStore?
- [ ] When do you use Room vs DataStore vs in-memory state?
- [ ] Write a DataStore read + write from blank (Preferences DataStore).

---

## SECTION 8 — Android Platform

- [ ] What is the Android Activity lifecycle? Name the callbacks in order.
- [ ] What is the difference between `onCreate`, `onStart`, `onResume`?
- [ ] What is a Context? What is the difference between Application context and Activity context?
- [ ] What is an Intent? What is the difference between explicit and implicit intent?
- [ ] How do you request a runtime permission in modern Android?
- [ ] What is a deep link? What is an app link?
- [ ] What is WorkManager? When do you use it vs a coroutine in viewModelScope?
- [ ] What is a foreground service? When do you need one?
- [ ] What is FCM? What is the difference between a data message and a notification message?

---

## SECTION 9 — DSA Implementation Prompts (Java, blank file)

### Patterns (write output on paper or in Kotlin Playground)
- [ ] Right triangle star pattern (n rows)
- [ ] Inverted triangle
- [ ] Pyramid
- [ ] Diamond
- [ ] Number triangle (1, 1 2, 1 2 3...)
- [ ] Floyd's triangle

### Arrays
- [ ] Reverse an array without using `.reversed()`
- [ ] Find the second largest element
- [ ] Two Sum: return indices of two numbers that add to target (HashMap approach)
- [ ] Move all zeros to the end of an array
- [ ] Find all duplicates in an array

### Strings
- [ ] Check if a string is a palindrome
- [ ] Check if two strings are anagrams
- [ ] Reverse each word in a sentence
- [ ] Count frequency of each character
- [ ] Find the first non-repeating character

### Linked List (implement from scratch in Java)
- [ ] `class Node { int val; Node next; Node(int val) { this.val = val; } }`
- [ ] `class LinkedList` with `Node head` — `insert(int val)` at end
- [ ] `delete(int val)`
- [ ] `reverse()` — iterative with 3 pointers (prev, curr, next)
- [ ] `printAll()`
- [ ] Detect a cycle (Floyd's — fast/slow pointer)

### Stack & Queue (Java)
- [ ] Stack using `ArrayList<Integer>`: push, pop, peek, isEmpty
- [ ] Queue using `int[]` with front/rear indices: enqueue, dequeue, peek
- [ ] Valid parentheses check using a Stack (`char` stack)

### Sorting (Java — write logic, not Arrays.sort)
- [ ] Bubble sort — write from scratch, state O(n²)
- [ ] Selection sort — write from scratch
- [ ] Know the idea of merge sort O(n log n) and quick sort O(n log n) avg — explain verbally

### HashMap (Java)
- [ ] Group anagrams: `HashMap<String, List<String>>`
- [ ] Find the most frequent element: `HashMap<Integer, Integer>` frequency count
- [ ] Two Sum (index version): `HashMap<Integer, Integer>` — value → index

### Trees (verbal — know the concept, write traversals)
- [ ] What is a binary tree? A binary search tree?
- [ ] Inorder, Preorder, Postorder traversal — write each recursively
- [ ] Level order (BFS) traversal
- [ ] Find height of a tree

---

## SECTION 10 — SQL (for written tests)

- [ ] `SELECT * FROM users WHERE age > 25 ORDER BY name ASC LIMIT 10`
- [ ] `SELECT department, COUNT(*) FROM employees GROUP BY department HAVING COUNT(*) > 5`
- [ ] `SELECT u.name, o.amount FROM users u INNER JOIN orders o ON u.id = o.user_id`
- [ ] `INSERT INTO products (name, price) VALUES ('Phone', 29999)`
- [ ] `UPDATE products SET price = 24999 WHERE id = 1`
- [ ] `DELETE FROM products WHERE id = 1`

Know these 6 templates cold. Most SQL interview questions are variations of these.

---

## SECTION 11 — Payment Gateways (verbal — explain the flow)

- [ ] Explain the end-to-end payment flow (app → backend → gateway → webhook → confirmation)
- [ ] Why does the client never decide whether a payment succeeded?
- [ ] What is Razorpay? How do you integrate it on Android (steps, not code)?
- [ ] What is a UPI intent flow?
- [ ] What is the difference between Razorpay and Stripe?

---

---

# PART 2 — CODING / IMPLEMENTATION CHALLENGES
> Open a blank `.kt` file or blank Android project. Write from scratch. AI off. Timer on.
> Target: each item below in under 15 minutes once you own it.

---

## C0 — Kotlin Language Implementation (Kotlin Playground, no Android)

### Null safety
- [ ] Write a function that takes a nullable `String?`, trims it if not null, returns "empty" otherwise — using `?.`, `?:`, `let`
- [ ] Write a function using `requireNotNull` and one using `checkNotNull` — know when to use each
- [ ] Write a smart cast example: check `is String`, then use it as String inside the block

### Collections
- [ ] Given a list of integers, return only the even ones, doubled, sorted descending — chain `filter`, `map`, `sortedDescending`
- [ ] Given a list of words, group them by their first letter — `groupBy`
- [ ] Given a list of students with name+grade, find the average grade — `map` + `average()`
- [ ] Given a list of pairs, convert to a Map where key is first, value is second — `associate` or `toMap()`
- [ ] Split a list into two: evens and odds — `partition`
- [ ] Sum all elements of a list using `fold` starting from 0
- [ ] Find the most frequent element in a list using `groupBy` + `maxByOrNull`

### Scope functions
- [ ] Use `let` to chain 3 nullable operations safely
- [ ] Use `apply` to configure a `StringBuilder` and return it
- [ ] Use `run` on an object to compute a value and return it
- [ ] Use `also` to log a value mid-chain without breaking the chain
- [ ] Use `with` on a data class to read multiple properties

### Higher-order functions
- [ ] Write a function `applyTwice(x: Int, f: (Int) -> Int): Int` — apply f twice
- [ ] Write a function `filter(list: List<Int>, predicate: (Int) -> Boolean): List<Int>` — from scratch, no stdlib
- [ ] Write a function that takes a lambda with a receiver: `buildString { append("Hello") }`
- [ ] Write a memoization wrapper: takes a function, returns a cached version

### Extension functions
- [ ] Write `String.isPalindrome(): Boolean`
- [ ] Write `List<Int>.secondLargest(): Int?`
- [ ] Write `Int.factorial(): Long`
- [ ] Write `String.wordCount(): Map<String, Int>` — count frequency of each word

### Sealed classes + when
- [ ] Write a `Result<T>` sealed class with `Success(data: T)`, `Error(message: String)`, `Loading`
- [ ] Write a `when` expression on it that is exhaustive — compiler should warn if you miss a case
- [ ] Write a `Shape` sealed class (Circle, Rectangle, Triangle) with an `area(): Double` function in each

### Data classes
- [ ] Write a `User(id: Int, name: String, email: String)` data class
- [ ] Use `copy` to update just the email
- [ ] Destructure it in a `for` loop over a list
- [ ] Show `==` works by value, not reference

### Generics
- [ ] Write a generic `Stack<T>` class with push, pop, peek, isEmpty
- [ ] Write a generic `Pair<A, B>` from scratch
- [ ] Write a function `<T : Comparable<T>> max(a: T, b: T): T`

### Coroutines (Kotlin Playground or unit test)
- [ ] Write a suspend function that delays 1 second and returns a string
- [ ] Launch two coroutines with `async`, await both, combine results
- [ ] Write a Flow that emits 1 to 5 with a 100ms delay between each, collect and print
- [ ] Apply `map`, `filter`, `take` operators on a Flow
- [ ] Use `catch` operator on a Flow to handle an exception without crashing the collector

---

## C1 — Compose & Android UI Implementation

- [ ] **2-column grid**: `LazyVerticalGrid(columns = Fixed(2))` with a `Product(name, imageUrl)` data class, fake list of 10, each item is a `Card` with `AsyncImage` (Coil) + `Text`
- [ ] **State hoisting**: write a stateless `CounterButton` composable that takes `count: Int` and `onIncrement: () -> Unit`. Write a stateful wrapper that holds state.
- [ ] **Search bar**: `TextField` with state, filter a `LazyColumn` list in real time as user types
- [ ] **Loading/Success/Error state**: sealed class `UiState`, show `CircularProgressIndicator` for Loading, list for Success, `Text(error)` for Error
- [ ] **AnimatedVisibility**: show/hide a card with a fade+slide animation on button click
- [ ] **AnimatedContent**: swap between two composables (e.g. login form vs success message) with a crossfade
- [ ] **BottomNavigationBar**: 3 tabs, each with its own composable, Navigation 3 nav graph, selected tab highlights
- [ ] **TopAppBar with back button**: navigate back, disable back on root screen
- [ ] **Pull-to-refresh**: `PullToRefreshBox` wrapping a `LazyColumn`, trigger a ViewModel reload
- [ ] **Snackbar**: show from ViewModel event (SharedFlow), use `SnackbarHostState`
- [ ] **Dialog**: custom confirmation dialog composable, show on button click, dismiss on confirm/cancel
- [ ] **Custom Modifier**: write a `Modifier.coloredBorder(color, width)` extension
- [ ] **LaunchedEffect**: trigger an API call once when the screen opens (key = Unit)
- [ ] **DisposableEffect**: register and unregister a listener on entry/exit

---

## C2 — Architecture Implementation

- [ ] **Sealed UiState from blank**: `sealed class ProductUiState { object Loading; data class Success(val products: List<Product>); data class Error(val message: String) }`
- [ ] **ViewModel with StateFlow**: `private val _uiState = MutableStateFlow<ProductUiState>(Loading)`, expose as `val uiState: StateFlow<ProductUiState> = _uiState.asStateFlow()`
- [ ] **Repository interface + fake impl**: write `ProductRepository` interface with `getProducts(): Flow<List<Product>>`, write `FakeProductRepository` returning hardcoded data
- [ ] **Koin module from blank**: `val appModule = module { single { FakeProductRepository() as ProductRepository }; viewModel { ProductViewModel(get()) } }`
- [ ] **Hilt module from blank**: `@Module @InstallIn(SingletonComponent::class) object AppModule { @Provides @Singleton fun provideRepo(): ProductRepository = FakeProductRepository() }`
- [ ] **UseCase**: write `GetProductsUseCase(private val repo: ProductRepository)` with `operator fun invoke(): Flow<List<Product>>`
- [ ] **Result wrapper end-to-end**: repository returns `Result<List<Product>, DataError>`, ViewModel maps it to UiState, UI shows each state

---

## C3 — Navigation Implementation

- [ ] **Basic 2-screen nav from blank**: `NavHost`, `composable("home") {}`, `composable("detail/{id}") {}`, navigate with `navController.navigate("detail/42")`
- [ ] **Typed route objects** (Navigation 3): `@Serializable data class DetailRoute(val id: Int)`, pass as nav argument, extract in destination
- [ ] **Pass a string arg**: from Home, navigate to Detail passing a name, show "Hello, {name}" on Detail
- [ ] **Back stack management**: `popUpTo`, `launchSingleTop` — demonstrate the difference
- [ ] **Nested nav graph**: auth graph (Login, Register) + main graph (Home, Detail, Profile) — switch between them on login/logout
- [ ] **BottomBar nav**: each tab has its own back stack, switching tabs doesn't re-create screens

---

## C4 — Networking Implementation

### Retrofit
- [ ] Write a complete `NetworkModule` from blank: `OkHttpClient` with `HttpLoggingInterceptor`, `Retrofit` instance with `GsonConverterFactory` / `kotlinx.serialization`, base URL
- [ ] Write an `ApiService` interface: `@GET("posts")`, `@GET("posts/{id}")`, `@POST("posts") @Body`, `@Query`, `@Header`
- [ ] Write an `AuthInterceptor`: reads token from a local store, adds `Authorization: Bearer $token` header to every request
- [ ] Write a `safeApiCall` wrapper: wraps a suspend Retrofit call in try-catch, returns `Result<T, NetworkError>`
- [ ] End-to-end: `ApiService` → `RemoteDataSource` → `Repository` → `ViewModel` → `LazyColumn`

### Ktor
- [ ] Write a `KtorHttpClient` from blank: `HttpClient(Android) { install(ContentNegotiation) { json() }; install(Logging) { level = ALL } }`
- [ ] Write a GET call: `client.get("https://jsonplaceholder.typicode.com/posts").body<List<Post>>()`
- [ ] Write a POST call with request body
- [ ] Add a default Bearer token header to all Ktor requests using `defaultRequest { header(HttpHeaders.Authorization, "Bearer $token") }`
- [ ] Handle HTTP errors with `HttpResponseValidator`

### Error handling
- [ ] Write a `NetworkError` sealed class: `NoInternet`, `Timeout`, `ServerError(code: Int)`, `Unknown`
- [ ] Map `IOException` → `NoInternet`, `SocketTimeoutException` → `Timeout`, HTTP 5xx → `ServerError`
- [ ] JWT refresh: write the OkHttp `Authenticator` that intercepts 401, calls refresh endpoint, retries with new token

---

## C5 — Authentication Implementation

- [ ] **Firebase email/password from blank**: `FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)`, handle `Tasks.await` or `.addOnSuccessListener`
- [ ] **Auth state observer**: `FirebaseAuth.getInstance().addAuthStateListener { user -> if (user != null) navigate to home else navigate to login }`
- [ ] **DataStore token storage**: write `TokenDataStore` — `save(token: String)`, `getToken(): Flow<String?>`, `clear()`
- [ ] **JWT interceptor**: read token from DataStore synchronously in OkHttp interceptor (use `runBlocking` — know why this is acceptable here)
- [ ] **JWT refresh flow on 401**: OkHttp `Authenticator` — call `/refresh`, get new token, save it, retry original request; if refresh fails, clear tokens and redirect to login
- [ ] **Google Sign-In via Credential Manager**: `CredentialManager.create(context).getCredential(request, activity)`, parse `GoogleIdTokenCredential`

---

## C6 — Local Persistence Implementation

- [ ] **Room from blank**: `@Entity data class Product(...)`, `@Dao interface ProductDao { @Query @Insert @Delete }`, `@Database class AppDatabase(...)`, access via `Room.databaseBuilder`
- [ ] **Room with Flow**: DAO returns `Flow<List<Product>>`, repository collects it, ViewModel exposes as StateFlow
- [ ] **Room migration**: add a new column in v2, write `Migration(1, 2) { database.execSQL("ALTER TABLE...") }`
- [ ] **DataStore write + read**: `context.dataStore.edit { it[KEY] = value }`, read with `context.dataStore.data.map { it[KEY] }`
- [ ] **Offline-first pattern**: fetch from network → save to Room → UI always reads from Room Flow (single source of truth)

---

## C7 — Testing Implementation

- [ ] **ViewModel unit test**: JUnit5 + `UnconfinedTestDispatcher`, inject a `FakeRepository`, call ViewModel function, assert StateFlow value
- [ ] **Test a Flow with Turbine**: `viewModel.uiState.test { assertIs<Loading>(awaitItem()); assertIs<Success>(awaitItem()) }`
- [ ] **MockK**: `val repo = mockk<ProductRepository>()`, `coEvery { repo.getProducts() } returns flowOf(fakeList)`, verify with `coVerify`
- [ ] **Fake repository**: implement `ProductRepository` interface with hardcoded data — prefer this over mocks for complex scenarios
- [ ] **Compose UI test**: `composeTestRule.setContent { ProductScreen(...) }`, `onNodeWithText("Phone").assertIsDisplayed()`, `onNodeWithContentDescription("Add").performClick()`

---

## C8 — Payment Gateway Implementation

- [ ] **Draw the payment flow on paper** (do this before any code): App → your backend → Razorpay creates order → orderId returned → App opens checkout → user pays → paymentId sent to backend → backend verifies → success
- [ ] **Razorpay Android**: add dependency, build `Checkout` object with `orderId`, `amount`, `currency`, call `checkout.open(activity, options)`, handle `onPaymentSuccess` / `onPaymentError` callbacks
- [ ] **UPI Intent**: build URI `upi://pay?pa=vpa&pn=name&am=amount&cu=INR`, launch with `Intent(Intent.ACTION_VIEW)`, handle result in `onActivityResult`
- [ ] **Stripe**: `PaymentSheet.init`, `paymentSheet.presentWithPaymentIntent(clientSecret)`, handle `PaymentSheetResult`

---

## C9 — AI Integration Implementation

- [ ] **Gemini text**: add `com.google.ai.client.generativeai` dependency, `val model = GenerativeModel("gemini-2.0-flash", apiKey)`, `model.generateContentStream("prompt")`, collect as Flow<String>
- [ ] **Gemini multimodal**: pass `content { image(bitmap); text("Describe this") }` to generateContent
- [ ] **ML Kit OCR**: `TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS)`, `.process(inputImage)`, extract blocks/lines/elements
- [ ] **ML Kit barcode**: `BarcodeScanning.getClient()`, `.process(inputImage)`, read `barcode.rawValue`
- [ ] **AI ViewModel pattern**: `_uiState: MutableStateFlow<AiUiState>`, streaming chunks update a `partialResponse: String` in state, `isLoading: Boolean` flag
- [ ] **OpenAI-compatible via Ktor**: POST to `/v1/chat/completions` with `messages`, `model`, `stream: true`; parse SSE chunks as Flow<String>

---

## C10 — KMP / CMP Implementation

- [ ] **Shared module setup**: `commonMain` with Ktor client + `kotlinx.serialization`, `androidMain` with Android engine, `iosMain` with Darwin engine
- [ ] **expect/actual**: write `expect fun getPlatformName(): String`, implement `actual` in androidMain and iosMain
- [ ] **Shared ViewModel** (KMP ViewModel): use `org.jetbrains.androidx.lifecycle:lifecycle-viewmodel` in commonMain
- [ ] **SQLDelight**: define `.sq` schema file, run codegen, call generated queries from `commonMain`
- [ ] **Koin in shared code**: `val sharedModule = module { single { KtorHttpClient() }; single { ProductRepositoryImpl(get()) } }`, `startKoin { modules(sharedModule) }` in both Android and iOS entry points
- [ ] **Compose Multiplatform**: move a simple `ProductListScreen` composable to `commonMain`, render on Android and desktop

---

*Add new challenges as you hit new interview questions. Date them so you know what's recent.*
