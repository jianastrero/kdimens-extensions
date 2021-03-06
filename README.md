# KDimens Extensions
Kotlin Extensions for converting dimensions

[![](https://jitpack.io/v/jianastrero/kdimens-extensions.svg)](https://jitpack.io/#jianastrero/kdimens-extensions)
# Usage
___
### PX to DP
```kotlin
// Convert any Number(Int, Float, Double, Etc.) from PX to DP
14.dp
```

### DP to PX
```kotlin
// Convert any Number(Int, Float, Double, Etc.) from DP to PX
14.pxOfDP
```

### PX to SP
```kotlin
// Convert any Number(Int, Float, Double, Etc.) from PX to SP
14.sp
```

### SP to PX
```kotlin
// Convert any Number(Int, Float, Double, Etc.) from SP to PX
14.pxOfSP
```

# Installation
___
### Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
### Step 2. Add the dependency
```groovy
dependencies {
    implementation 'com.github.jianastrero:kdimens-extensions:1.0'
}
```


# [LICENSE](LICENSE)
___
    MIT License
    
    Copyright (c) 2020 Jian James Astrero
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.