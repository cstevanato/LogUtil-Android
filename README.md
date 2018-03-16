# LogUtil-Android
Trabalhando com criação de biblioteca para compatilhamento

Step 1. Add the build.gradle
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  Step 2. Add the dependency

	dependencies {
	        compile 'com.github.cstevanato:LogUtil-Android:0.2.0'
	}
