# react-native-react-native-active-keyboards [![Node version](https://badge.fury.io/js/react-native-active-keyboards.svg)](http://nodejs.org/download/)

This is a simple module to let you determine if a specific keyboard is installed. Particularly useful if you have created your own custom keyboard.

## Getting started

`$ npm install react-native-active-keyboards --save`

### Mostly automatic installation

`$ react-native link react-native-active-keyboards`

### Manual installation

#### iOS

1.  In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2.  Go to `node_modules` ➜ `react-native-active-keyboards` and add `RNReactNativeActiveKeyboards.xcodeproj`
3.  In XCode, in the project navigator, select your project. Add `libRNReactNativeActiveKeyboards.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4.  Run your project (`Cmd+R`)<

#### Android

1.  Open up `android/app/src/main/java/[...]/MainActivity.java`

* Add `import com.reactlibrary.RNReactNativeActiveKeyboardsPackage;` to the imports at the top of the file
* Add `new RNReactNativeActiveKeyboardsPackage()` to the list returned by the `getPackages()` method

2.  Append the following lines to `android/settings.gradle`:
    ```
    include ':react-native-active-keyboards'
    project(':react-native-active-keyboards').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-active-keyboards/android')
    ```
3.  Insert the following lines inside the dependencies block in `android/app/build.gradle`:
    ```
      compile project(':react-native-active-keyboards')
    ```

## Usage

```javascript
import { keyboardEnabled } from "react-native-active-keyboards";

[...]
  async componentWillMount() {
    // @param keyboardId
    const enabled = await keyboardEnabled("keyboardName");
    console.log("IN APP", enabled);
  }
[...]
```
