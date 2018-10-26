import { NativeModules, Platform } from "react-native";
import _ from "lodash";

const { RNReactNativeActiveKeyboards } = NativeModules;
console.log("FUNCTIONS", RNReactNativeActiveKeyboards);
export const keyboardEnabled = async key => {
  try {
    const keyboards = await RNReactNativeActiveKeyboards.keyboardEnabled();
    console.log("KEYBOARDS", keyboards);
    if (Platform.OS === "android") {
      if (keyboards.indexOf(key) !== -1) {
        console.log("TRUE");
        return true;
      } else {
        console.log("FALSE");
        return false;
      }
    } else if (Platform.OS === "ios") {
      if (_.indexOf(keyboards, key)) {
        console.log("TRUE");
        return true;
      } else {
        console.log("TRUE");
        return false;
      }
    }
  } catch (error) {
    throw error;
  }
};
