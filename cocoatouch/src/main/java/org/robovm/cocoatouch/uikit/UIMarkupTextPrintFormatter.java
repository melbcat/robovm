/*
 * Copyright (C) 2012 RoboVM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.cocoatouch.uikit;

/*<imports>*/
import org.robovm.cocoatouch.coreanimation.*;
import org.robovm.cocoatouch.coredata.*;
import org.robovm.cocoatouch.coregraphics.*;
import org.robovm.cocoatouch.coreimage.*;
import org.robovm.cocoatouch.foundation.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.bind.*;
import org.robovm.objc.block.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
/*</imports>*/

/**
 *
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIMarkupTextPrintFormatter_Class/Reference/Reference.html">UIMarkupTextPrintFormatter Class Reference</a>
 *   @since Available in iOS 4.2 and later.
 * </div>
 */
/*<library>*/@Library("UIKit")/*</library>*/
public class /*<name>*/ UIMarkupTextPrintFormatter /*</name>*/ 
    extends /*<extends>*/ UIPrintFormatter /*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ UIMarkupTextPrintFormatter /*</name>*/.class);
    }

    private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ UIMarkupTextPrintFormatter /*</name>*/.class);

    /*<constructors>*/
    protected UIMarkupTextPrintFormatter(SkipInit skipInit) { super(skipInit); }
    public UIMarkupTextPrintFormatter() {}
    
    private static final Selector initWithMarkupText$ = Selector.register("initWithMarkupText:");
    @Bridge(symbol = "objc_msgSend") private native static NSObject objc_initWithMarkupText(UIMarkupTextPrintFormatter __self__, Selector __cmd__, String markupText);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIMarkupTextPrintFormatter_Class/Reference/Reference.html#//apple_ref/occ/instm/UIMarkupTextPrintFormatter/initWithMarkupText:">- (id)initWithMarkupText:(NSString *)markupText</a>
     * @since Available in iOS 4.2 and later.
     */
    public UIMarkupTextPrintFormatter(String markupText) {
        super((SkipInit) null);
        objc_initWithMarkupText(this, initWithMarkupText$, markupText);
    }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIMarkupTextPrintFormatter_Class/Reference/Reference.html#//apple_ref/occ/instp/UIMarkupTextPrintFormatter/markupText">@property(nonatomic, copy) NSString *markupText</a>
     * @since Available in iOS 4.2 and later.
     */
    @Bind("markupText") public native String getMarkupText();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIMarkupTextPrintFormatter_Class/Reference/Reference.html#//apple_ref/occ/instp/UIMarkupTextPrintFormatter/markupText">@property(nonatomic, copy) NSString *markupText</a>
     * @since Available in iOS 4.2 and later.
     */
    @Bind("setMarkupText:") public native void setMarkupText(String v);
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/

}