
#import "RNReactNativeActiveKeyboards.h"

@implementation RNReactNativeActiveKeyboards

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

- (NSDictionary *)constantsToExport
{
    return @{ @"initialExtensions": [[[NSUserDefaults standardUserDefaults] dictionaryRepresentation] objectForKey:@"AppleKeyboards"]};
}

RCT_REMAP_METHOD(keyboardEnabled,
                 findEventsWithResolver:(RCTPromiseResolveBlock)resolve
                 rejecter:(RCTPromiseRejectBlock)reject)
{
    
    resolve([[[NSUserDefaults standardUserDefaults] dictionaryRepresentation] objectForKey:@"AppleKeyboards"]);
    
}

+ (BOOL)requiresMainQueueSetup
{
  return YES;
}

@end
  
