# This is a configuration file for ProGuard.
# http://proguard.sourceforge.net/index.html#manual/usage.html

-dontusemixedcaseclassnames
-verbose

# Optimization
-optimizationpasses 5
-dontusemixedcaseclassnames
-verbose
-optimizations !code/simplification/arithmetic,!code/simplification/cast,!field/*,!class/merging/*

# Keep line numbers for debugging stack traces
-keepattributes SourceFile,LineNumberTable
-renamesourcefileattribute SourceFile

# Keep AndroidX
-keep class androidx.** { *; }
-dontwarn androidx.**

# Keep Material
-keep class com.google.android.material.** { *; }
-dontwarn com.google.android.material.**

# Keep custom application classes
-keep class com.elpop.studio.** { *; }
