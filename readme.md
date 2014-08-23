ISPCU Android App
=================

This is the Android app for [ISPCU](https://ispcu.org/). It's purpose is to allow people to have
easier access to the information, news updates, and voting that the website provides, but on their
Android phone. It is built to support API level 14 (Android 4.0) and above. It has a list of features planned,
but for now we are just trying to mimic the accessibility of the website. The aesthetic of the app
also strictly follows the website, while still conforming to Android design guidelines.

Building
--------
### Installing the JDK
To build Android applications you need to have the JDK installed.
You can get the most recent JDK [here](http://www.oracle.com/technetwork/java/javase/downloads/index.html).

Once you have the JDK installed, make sure to set the environment variable `JAVA_HOME` to the root directory of the JDK.
#### Windows
To do this on Windows go to Control Panel -> System and Security -> System and click on `Advanced system settings` on the left side.
Then, click `Environment Variables`, and Under `System variables`, click `New...`
In `Variable name:` put `JAVA_HOME` and in `Variable value:` put the full path to the JDK.
#### Linux
Open the terminal and run the command `export JAVA_HOME="/full/path/to/jdk"`
#### Mac OS X
Apple keeps the JDK up to date and distributes it themselves, you shouldn't have to setup anything here.

### Installing Android Studio

To build the ISPCU Android app, you will need Android Studio. Get the most recent version of Android
Studio from [here](https://developer.android.com/sdk/installing/studio.html).

Once you have Android Studio, follow these steps to get it set-up:
1. Open Android Studio, and open the Android SDK Tools (Configure -> SDK Manager)
2. Update to the most recent Android SDK Tools, Android SDK Platform Tools and Android SDK Build Tools if it is not already (these should be auto-selected if they need to be updated)
3. Make sure you have the most recent version of Android Support Repository installed (Extras -> Android support Repository)
4. Make sure you have the SDK Platform for API level 19 installed
5. Close the SDK Manager
6. Make sure you have [git](http://git-scm.com/) installed, and make sure Android Studio is set up to use it (Configure -> Project Defaults -> Settings -> Version Control -> Git)
7. Now click `Check out from Version Control` and choose `git`.
8. Enter `https://DemonWav@bitbucket.org/DemonWav/ispcu.git` into the URL box and click clone.
9. Follow the dialogue boxes to import the IDEA project from Gradle, be patient, this may take a while.
10. Once the project has been synced, you're ready to start coding! Good luck!