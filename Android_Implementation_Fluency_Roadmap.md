# Android Implementation Fluency Roadmap
### For Tarun — converting "I understand it" into "I can code it from blank, on the spot"

> **Core rule:** For every item below, the goal is not to *read* about it. The goal is to type a working minimal version **from an empty file, with AI off, in under ~15 minutes.** If you can't, repeat it in 2 days. That repetition is what kills the interview freeze.

---

## How to use this document

1. Go tier by tier. Don't jump ahead — later tiers assume earlier ones.
2. For each unchecked box: **learn it once → rebuild minimal version from blank → wait 2 days → rebuild again from memory → diff.** Only then tick it.
3. Build the **playground apps** (bottom of file) instead of cramming everything into Aethera. Isolated practice = faster reps.
4. Tick a box only when you can produce it cold. "I get it" doesn't count.
5. **Verbal drill** — for every topic you tick, also answer these 3 questions out loud: "What is it?", "Why does it exist?", "Write a 5-line example from memory." Interviews test both — building AND explaining.

---

## Daily routine (non-negotiable minimum)

| Time | Activity |
|---|---|
| 30 min | DSA in Kotlin (Tier 0-B) — 1–2 problems on LeetCode Easy or Kotlin Playground |
| 45 min | Android blank-file drill (current sprint tier) — AI off |
| 5 min | Pick 3 questions from `Interview_Question_Bank.md`, say answers out loud |

Saturday: rebuild everything from that week from memory, no notes open. That's what kills the interview freeze.

---

## TIER 0 — Kotlin language (the foundation you skipped)
You learned Kotlin *through* Android, so the bare language has gaps. Do these in Kotlin Playground / CLI, NOT Android Studio.

- [ ] Collections fluency: `map`, `filter`, `groupBy`, `fold`, `reduce`, `associateBy`, `partition`
- [ ] Scope functions: `let`, `run`, `with`, `apply`, `also` — know *when* to use each
- [ ] Null handling idioms: `?.`, `?:`, `let`, `requireNotNull`, smart casts
- [ ] Sealed classes / interfaces + `when` exhaustiveness
- [ ] Data classes, `copy`, destructuring
- [ ] Generics: variance (`in`/`out`), reified types
- [ ] Delegation: `by lazy`, `by`, custom delegates
- [ ] Extension functions & properties
- [ ] Coroutines fundamentals: `suspend`, `launch`, `async`, structured concurrency
- [ ] Flow fundamentals: `flow {}`, operators, `collect`

---

## TIER 0-B — DSA in Kotlin *(was missing — this is why you fail coding rounds)*
> Do in Kotlin Playground (play.kotlinlang.org) or plain `.kt` files. No Android Studio.
> Platform: LeetCode Easy filtered by Kotlin + HackerRank 30 Days of Code. 1–2 problems/day.

- [ ] **Patterns**: right triangle, inverted, pyramid, diamond, number triangle — write output using nested loops
- [ ] **Arrays**: reverse without built-ins, find second largest, two-sum with HashMap, move zeros to end, find duplicates
- [ ] **Strings**: palindrome check, anagram check, reverse each word, character frequency map, first non-repeating char
- [ ] **LinkedList from scratch**: `data class Node(val value: Int, var next: Node? = null)` + `LinkedList` class — insert, delete, reverse, print, detect cycle (Floyd's)
- [ ] **Stack**: implement with `MutableList` — push, pop, peek, isEmpty; solve: balanced parentheses check
- [ ] **Queue**: implement with `ArrayDeque` — enqueue, dequeue, peek
- [ ] **HashMap problems**: group anagrams, frequency count, two-sum index version
- [ ] **Sorting**: write bubble sort + selection sort by hand; know: bubble O(n²), merge O(n log n), quick O(n log n) avg, insertion O(n²)
- [ ] **Binary search**: on sorted array, return index of target
- [ ] **Recursion basics**: factorial, fibonacci, sum of digits
- [ ] **Trees**: BFS node class, inorder/preorder/postorder (recursive), level-order BFS with Queue, find height

---

## TIER 0-C — Developer fundamentals *(gaps that trip freshers in interviews)*

### Git (1 day — do this first, before any project)
- [✓] `git init`, `add`, `commit`, `push`, `pull`, `clone`
- [ ] Branching: `checkout -b`, `merge`; understand `rebase` conceptually
- [ ] Resolve a merge conflict by hand (create one deliberately and fix it)
- [ ] PR workflow: branch → push → open PR → review → merge
- [ ] Conventional commits: `feat:`, `fix:`, `chore:`, `docs:` — use these in android-lab

### Debugging Android (1 day)
- [ ] Logcat: filter by tag (`Log.d("TAG", "message")`), read a stack trace, find the crash line
- [ ] Android Studio debugger: set a breakpoint, step over, step into, inspect variable value at runtime
- [ ] Read a `NullPointerException` and locate exactly where it's thrown
- [ ] LeakCanary: what it detects, how to read its report

### SQL basics (1 day — for written tests and Room queries)
- [ ] SELECT with WHERE, ORDER BY, LIMIT
- [ ] INSERT, UPDATE, DELETE
- [ ] INNER JOIN between 2 tables on a foreign key
- [ ] GROUP BY + COUNT + HAVING
- [ ] Practice at: sqlzoo.net (browser, no setup)

### HTTP fundamentals (verbal)
- [ ] GET vs POST vs PUT vs PATCH vs DELETE — when to use each
- [ ] Status codes by memory: 200, 201, 400, 401, 403, 404, 500
- [ ] Request header vs body — what goes where
- [ ] What is a Bearer token and where does it go
- [ ] REST vs GraphQL vs WebSocket — one sentence each

---

## TIER 1 — Compose & core Android fundamentals

- [ ] Composables, recomposition, **why** recomposition happens
- [ ] State: `mutableStateOf`, `remember`, `rememberSaveable`, `derivedStateOf`
- [ ] **State hoisting** (stateless composable + state holder) — interviewers love this
- [ ] Side effects: `LaunchedEffect`, `DisposableEffect`, `rememberCoroutineScope`, `SideEffect`, `produceState`, `snapshotFlow`
- [ ] Lists: `LazyColumn`/`LazyRow`/`LazyVerticalGrid`, `key`, item performance
- [ ] Layouts: `Row`, `Column`, `Box`, `ConstraintLayout`, custom `Layout`
- [ ] `Modifier` deep dive (order matters, why)
- [ ] ViewModel + `collectAsStateWithLifecycle`
- [ ] Lifecycle: Activity/Fragment lifecycle, Context types (interviewers still ask)
- [ ] Navigation (Navigation 3) — routes, args, nested graphs

---

## TIER 2 — Architecture & state management

- [ ] MVVM (you know) → also understand **MVI** and unidirectional data flow
- [ ] `StateFlow` vs `SharedFlow` vs `LiveData` — when and why each
- [ ] Repository pattern + UseCase / Interactor layer
- [ ] Clean Architecture layer boundaries (domain has no Android imports)
- [ ] DI with both **Hilt and Koin** — be able to write a module from blank
- [ ] A `Result`/`sealed` wrapper for success/error/loading state

---

## TIER 3 — Networking

- [ ] **Retrofit + OkHttp**: interceptors, logging, auth header injection
- [ ] **Ktor client** (you'll need this for KMP too)
- [ ] Serialization: `kotlinx.serialization` (and know Moshi/Gson exist)
- [ ] **GraphQL** with Apollo Kotlin: queries, mutations, codegen
- [ ] **WebSocket**: OkHttp `WebSocket` or Ktor — connect, send, receive, reconnect
- [ ] Error handling: timeouts, retry, mapping network → domain errors
- [ ] **Paging 3** (infinite scroll / pagination)
- [ ] Offline-first / caching strategy (network + Room as single source of truth)

---

## TIER 4 — Local persistence

- [ ] **Room**: entities, DAO, relations, migrations
- [ ] **DataStore** (Preferences + Proto) — the modern SharedPreferences replacement
- [ ] When to use Room vs DataStore vs in-memory
- [ ] File / cache storage basics

---

## TIER 5 — Authentication & security  *(your list, expanded)*

- [ ] **JWT**: store securely, attach via interceptor, **refresh-token flow** (auto-refresh on 401) — this is the one that trips people up
- [ ] **OAuth 2.0 / OIDC**: Google Sign-In via **Credential Manager** (the current API)
- [ ] **Firebase Auth**: email/password, Google, phone OTP
- [ ] **Supabase Auth**: setup + session handling
- [ ] **Session management**: token lifecycle, logout, expiry
- [ ] **Secure storage**: `EncryptedSharedPreferences` / DataStore + Android Keystore
- [ ] **Biometric auth** (BiometricPrompt)
- [ ] Security hardening: certificate pinning, R8/ProGuard, keeping secrets out of code

---

## TIER 6 — Payments  *(your list)*

> **The #1 interview insight:** the client never decides "payment succeeded." Backend creates the order, client pays, backend verifies via webhook/signature. Be able to explain this flow before any SDK.

- [ ] **Razorpay** SDK integration (India)
- [ ] **UPI intent flow** / PhonePe (India)
- [ ] **Stripe** (global / USD)
- [ ] **PayPal** (global)
- [ ] Order creation → payment → server-side verification flow (draw it)

---

## TIER 7 — Advanced UI  *(your list, expanded)*

- [ ] **WebView**: load URL, JS bridge (`addJavascriptInterface`), two-way native↔web communication, handle back press in web history
- [ ] **Server-Driven UI**: JSON schema → dynamic Compose rendering, component registry, fallback handling (your Aethera plan — build it isolated first)
- [ ] **Animations**: `animate*AsState`, `updateTransition`, `AnimatedVisibility`, `AnimatedContent`, gesture-driven
- [ ] Custom drawing with `Canvas`
- [ ] Custom layouts (`Layout` composable)
- [ ] **Theming / design system**: Material 3, dynamic color, custom tokens
- [ ] Accessibility (`semantics`)
- [ ] **Adaptive layouts**: window size classes (tablet / foldable)

---

## TIER 7-B — AI Integration in Android *(you mentioned this, it was missing)*

> Architecture pattern: UI → ViewModel → UseCase → AI Repository → AI SDK. Stream responses as `Flow<String>`.

- [ ] **Gemini API** (text generation): add `generativeai` dependency, build a `GenerativeModel`, send a prompt, collect streaming response as Flow
- [ ] **Gemini multimodal**: send image + text prompt (e.g. scan a document, describe a product photo)
- [ ] **ML Kit on-device** (no internet needed): text recognition (OCR), barcode/QR scan, face detection, language detection
- [ ] **MediaPipe Tasks**: image classification or object detection on-device
- [ ] **OpenAI-compatible APIs via Ktor**: same pattern as any REST call — POST to `/v1/chat/completions`, parse SSE streaming response
- [ ] **AI in architecture**: wrap AI calls in a `Result` sealed class, expose as `StateFlow` in ViewModel, handle loading/error/streaming states cleanly
- [ ] **Prompt engineering basics**: system prompt vs user prompt, temperature, token limits — know these for interviews

---

## TIER 8 — Async & background work

- [ ] Coroutines deep: dispatchers, `supervisorScope`, exception handling, cancellation
- [ ] Flow operators: `combine`, `flatMapLatest`, `debounce`, `distinctUntilChanged`, `stateIn`
- [ ] **WorkManager**: deferrable background jobs, constraints
- [ ] Foreground services + notifications
- [ ] **FCM push notifications** (data vs notification messages)

---

## TIER 9 — Cross-platform: KMP & CMP  *(your list)*

- [ ] KMP shared module: `expect`/`actual`
- [ ] Shared networking: Ktor + kotlinx.serialization
- [ ] Shared DB: **SQLDelight**
- [ ] Koin in shared code
- [ ] **Compose Multiplatform**: shared UI across Android/iOS/desktop
- [ ] Platform-specific code injection

---

## TIER 10 — Quality, testing & delivery  *(the fresher differentiator)*

> Almost no fresher can write a test. Doing this alone moves you ahead of the pack.

- [ ] **Unit tests**: JUnit + **MockK** + **Turbine** (for testing Flows)
- [ ] **Compose UI tests**
- [ ] Test a ViewModel end to end
- [ ] **CI/CD**: GitHub Actions (build + test on push) — add to your template repo
- [ ] Performance: recomposition counts, baseline profiles, **LeakCanary**
- [ ] Crashlytics / analytics
- [ ] Release: signing, app bundles, Play Console tracks

---

## TIER 11 — Platform & system

- [ ] Runtime permissions (modern API)
- [ ] Deep links / app links
- [ ] Intents & sharing
- [ ] CameraX, Media3 (you have some)
- [ ] Location, sensors (as needed)

---

## Playground apps (build these instead of cramming into Aethera)

Each isolates a cluster so you can rebuild it fast and repeatedly.

1. **AuthLab** → Tier 5. JWT refresh flow + Google Sign-In + biometric lock. One backend (use a free JWT mock or Supabase).
2. **NetLab** → Tier 3. Same app talks to REST, then GraphQL, then a WebSocket echo. Switchable.
3. **PayLab** → Tier 6. Razorpay test mode + the order→verify flow with a tiny mock backend.
4. **SDUILab** → Tier 7. Render a screen entirely from a JSON file. This becomes your Aethera SDUI module.
5. **KMPLab** → Tier 9. Shared Ktor + SQLDelight, Compose Multiplatform UI.

---

## Suggested sequence (you're job-hunting, so keep it lean)

**Week 1 (start today):**
- Tier 0-C: Git (1 day) → SQL (1 day) → HTTP fundamentals (verbal, 1 day)
- Tier 0-B: Patterns + Arrays/Strings (DSA daily, runs for all of weeks 1–4)
- Tier 0: Kotlin Koans — Introduction + Collections sections

**Weeks 2–4:** Tier 0 Kotlin language (complete) + Tier 1 & 2 from blank.
Lock: LazyVerticalGrid, Navigation args, ViewModel+StateFlow, sealed UiState, Koin module. These are 80% of interview implementation questions.

**Weeks 5–6:** Tier 0-B continues (LinkedList, Stack, Queue, Trees) + Tier 3 NetLab (Retrofit → Ktor → error handling).

**Weeks 7–8:** Tier 4 (Room + DataStore) + Tier 5 AuthLab (Firebase Auth first → JWT refresh flow).

**Weeks 9–10:** Tier 6 PayLab (Razorpay + UPI flow) + Tier 10 testing basics (ViewModel unit test with MockK + Turbine — pull this forward, it's your Signzy gap).

**Weeks 11–12:** Tier 7 (WebView + SDUI SDUILab) + Tier 7-B AI Integration.

**Ongoing:** Tier 8, 9 (KMP/CMP KMPLab), 11.

Testing (Tier 10) is the cheapest way to stand out as a fresher — pull a little of it into every sprint whenever you can.

---

*Tick a box only when you can produce it from a blank file, AI off, ~15 min. That's the whole game.*
