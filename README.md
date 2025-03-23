# CustomToastLib

A lightweight, customizable Android toast library built with simplicity and style in mind.

This library lets you show beautiful toasts with Lottie animations, custom background, and colored messages — without requiring AndroidX or complex setup.

[![](https://jitpack.io/v/oyin25/CustomToastLib.svg)](https://jitpack.io/#oyin25/CustomToastLib)

---

## Features

- Custom toast layout
- Success, Info, and Warning styles
- Smooth Lottie animation support
- Customizable colors and elevation
- No AndroidX required
- Works from Activities or Contexts

---

## Installation

### Step 1: Add JitPack to your root `settings.gradle` or `settings.gradle.kts`

Groovy (settings.gradle):
```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```

Kotlin DSL (settings.gradle.kts):
```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

---

### Step 2: Add the dependency to your `app/build.gradle`

```groovy
dependencies {
    implementation 'com.github.oyin25:CustomToastLib:v1.0.0'
}
```

---

## Usage

Show a success message:
```java
CustomToast.showSuccess(this, "Purchase successful!");
```

Show a warning:
```java
CustomToast.showWarning(this, "Phone number is missing.");
```

Show info:
```java
CustomToast.showInfo(this, "Fetching profile...");
```

> `this` must be a `Context` — like an Activity.

---

## Screenshots

(Insert screenshots or preview GIFs here if available)

---

## License

MIT License

```
MIT License

Copyright (c) 2025 oyin25

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions...
```

---

## Author

Made with passion by [@oyin25](https://github.com/oyin25)