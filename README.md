# LogUtil
This is a library project to print log.

# Getting Started

To add LogUtil to your project (Using Android Studio and Gradle): 
  
  Step 1. Add the JitPack repository to your build file
  
  Add it in your root build.gradle at the end of repositories:
  
  ```
  	allprojects {
  		repositories {
  			...
  			maven { url 'https://jitpack.io' }
  		}
  	}
  ```
  
  Step 2. Add the dependency
  
  ```
  	dependencies {
  	        implementation 'com.github.arifbd:LogUtil:0.1.1'
  	}
  ```
  

#### In the Log level menu, select one of the following values:
LogUtil.verbose: Show all log messages (the default).

LogUtil.debug: Show debug log messages that are useful during development only, as well as the message levels lower in this list.

LogUtil.info: Show expected log messages for regular usage, as well as the message levels lower in this list.

LogUtil.warn: Show possible issues that are not yet errors, as well as the message levels lower in this list.

LogUtil.error: Show issues that have caused errors, as well as the message level lower in this list.

LogUtil.wtf: Show issues that the developer expects should never happen.


### Screenshots    
![alt text](https://raw.githubusercontent.com/arifbd/LogUtil/master/screenshot/debug.PNG)          


![alt text](https://raw.githubusercontent.com/arifbd/LogUtil/master/screenshot/error.PNG)          


![alt text](https://raw.githubusercontent.com/arifbd/LogUtil/master/screenshot/wtf.PNG)      