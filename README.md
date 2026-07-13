# android-lab

A hands-on lab where I rebuild Android components from scratch — one concept at a time.
Each demo is a single self-contained file with a `@Preview`. No copy-paste, no AI generation.
Built to sharpen implementation fluency and interview readiness.

**Stack:** Kotlin · Jetpack Compose · MVVM + Clean Architecture · Koin · Retrofit / Ktor · Room · Coroutines & Flow

---

## How this repo works

Every folder under `app/.../demos/` maps to a roadmap tier.
Each file = one concept, written from blank with a short `// WHAT / WHY` comment and a runnable `@Preview`.

`dsa/` = plain Java problems (run via `javac` / online compiler — no Android project needed). Java for DSA, Kotlin for Android.

**The rule:** tick a box only when you can reproduce it from a blank file in ~15 min, AI off.

---

## Progress

### DSA in Java
- [ ] Patterns (star/number)
- [ ] Arrays (reverse, two-sum, duplicates)
- [ ] Strings (palindrome, anagram, frequency)
- [ ] LinkedList from scratch (Node + insert/delete/reverse)
- [ ] Stack (MutableList-backed)
- [ ] Queue (ArrayDeque-backed)
- [ ] HashMap problems (group anagrams, frequency)
- [ ] Sorting (bubble, selection — write logic by hand)
- [ ] Binary search
- [ ] Recursion (factorial, fibonacci)
- [ ] Trees (inorder, preorder, postorder, BFS)

---

### Tier 0 — Kotlin Language
- [ ] Collections: map, filter, groupBy, fold, partition, associateBy
- [ ] Scope functions: let, run, with, apply, also
- [ ] Null handling: ?. ?: !! requireNotNull smart casts
- [ ] Sealed classes + when exhaustiveness
- [ ] Data classes, copy, destructuring
- [ ] Generics: in/out variance, reified
- [ ] Delegation: by lazy, custom delegates
- [ ] Extension functions & properties
- [ ] Coroutines: suspend, launch, async, structured concurrency
- [ ] Flow: flow {}, operators, collect

---

### Tier 1 — Compose & Fundamentals
- [ ] Composables + recomposition (why it happens)
- [ ] State: mutableStateOf, remember, rememberSaveable, derivedStateOf
- [ ] State hoisting (stateless composable + caller owns state)
- [ ] Side effects: LaunchedEffect, DisposableEffect, SideEffect, produceState
- [x] Lists: LazyColumn, LazyRow, LazyVerticalGrid (2-column), key param
- [ ] Layouts: Row, Column, Box, custom Layout
- [ ] Modifier deep dive (order matters)
- [ ] ViewModel + collectAsStateWithLifecycle
- [ ] Lifecycle: Activity lifecycle, Context types
- [x] Navigation: routes, args, nested graphs

---

### Tier 2 — Architecture
- [ ] MVVM — UiState data class + ViewModel + StateFlow
- [ ] MVI — Action/Event/State pattern
- [ ] StateFlow vs SharedFlow vs LiveData
- [ ] Repository pattern + UseCase layer
- [ ] Clean Architecture layer boundaries
- [ ] Koin DI — module from blank
- [ ] Hilt DI — module from blank
- [ ] Result/sealed wrapper (Loading/Success/Error)

---

### Tier 3 — Networking
- [ ] Retrofit + OkHttp + logging interceptor
- [ ] Auth header interceptor
- [ ] Ktor client
- [ ] kotlinx.serialization
- [ ] GraphQL with Apollo Kotlin
- [ ] WebSocket (OkHttp or Ktor)
- [ ] Paging 3
- [ ] Offline-first (network + Room as source of truth)

---

### Tier 4 — Persistence
- [ ] Room: entity, DAO, database, migration
- [ ] Room with Flow
- [ ] DataStore Preferences (read + write)
- [ ] When to use Room vs DataStore vs in-memory

---

### Tier 5 — Authentication
- [ ] Firebase email/password auth
- [ ] Firebase auth state observer + protected nav
- [ ] JWT: store in DataStore, attach via interceptor
- [ ] JWT refresh-token flow (auto-refresh on 401)
- [ ] Google Sign-In via Credential Manager
- [ ] Supabase Auth
- [ ] Biometric auth (BiometricPrompt)
- [ ] EncryptedSharedPreferences / secure storage

---

### Tier 6 — Payments
- [ ] Payment flow diagram (draw it before coding)
- [ ] Razorpay SDK integration
- [ ] UPI intent flow
- [ ] Stripe integration

---

### Tier 7 — Advanced UI
- [ ] WebView + JS bridge
- [ ] Server-Driven UI (JSON → Compose renderer)
- [ ] Animations: animateAsState, AnimatedVisibility, AnimatedContent
- [ ] Custom Canvas drawing
- [ ] Material 3 theming + dynamic color
- [ ] Adaptive layouts (window size classes)

---

### Tier 7-B — AI Integration
- [ ] Gemini API (text generation, streaming as Flow)
- [ ] Gemini multimodal (image + text)
- [ ] ML Kit OCR (text recognition)
- [ ] ML Kit barcode / QR scan
- [ ] AI in ViewModel (streaming UiState pattern)

---

### Tier 8 — Async & Background
- [ ] Coroutines deep: dispatchers, supervisorScope, cancellation
- [ ] Flow operators: combine, flatMapLatest, debounce, stateIn
- [ ] WorkManager (background jobs + constraints)
- [ ] Foreground service + notifications
- [ ] FCM push notifications

---

### Tier 9 — KMP & CMP
- [ ] KMP shared module: expect/actual
- [ ] Shared Ktor + kotlinx.serialization
- [ ] SQLDelight
- [ ] Koin in shared code
- [ ] Compose Multiplatform (shared UI)

---

### Tier 10 — Testing
- [ ] ViewModel unit test (JUnit5 + UnconfinedTestDispatcher)
- [ ] MockK: mock a repository
- [ ] Turbine: test a StateFlow / Flow
- [ ] Fake repository pattern
- [ ] Compose UI test (onNodeWithText, performClick)
- [ ] GitHub Actions CI (build + test on push)

---

## Commit format

```
feat(fundamentals): add state hoisting demo
feat(networking): add retrofit GET example
feat(dsa): add linked list reverse
fix(lists): correct LazyColumn key usage
docs: update progress checklist
```
