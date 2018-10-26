import { NativeModules, Platform } from "react-native";
import _ from "lodash";

const { RNReactNativeActiveKeyboards } = NativeModules;

export const keyboardEnabled = async key => {
  try {
    const keyboards = await RNReactNativeActiveKeyboards.keyboardEnabled();
    if (Platform.OS === "android") {
      if (keyboards.indexOf(key) !== -1) {
        return true;
      } else {
        return false;
      }
    } else if (Platform.OS === "ios") {
      if (_.indexOf(keyboards, key)) {
        return true;
      } else {
        return false;
      }
    }
  } catch (error) {
    throw error;
  }
};
