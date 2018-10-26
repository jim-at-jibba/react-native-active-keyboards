using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace React.Native.Active.Keyboards.RNReactNativeActiveKeyboards
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNReactNativeActiveKeyboardsModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNReactNativeActiveKeyboardsModule"/>.
        /// </summary>
        internal RNReactNativeActiveKeyboardsModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNReactNativeActiveKeyboards";
            }
        }
    }
}
