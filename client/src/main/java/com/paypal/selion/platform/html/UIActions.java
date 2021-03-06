/*-------------------------------------------------------------------------------------------------------------------*\
|  Copyright (C) 2014 eBay Software Foundation                                                                        |
|                                                                                                                     |
|  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance     |
|  with the License.                                                                                                  |
|                                                                                                                     |
|  You may obtain a copy of the License at                                                                            |
|                                                                                                                     |
|       http://www.apache.org/licenses/LICENSE-2.0                                                                    |
|                                                                                                                     |
|  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed   |
|  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for  |
|  the specific language governing permissions and limitations under the License.                                     |
\*-------------------------------------------------------------------------------------------------------------------*/

package com.paypal.selion.platform.html;

/**
 * This enum class represents all the "Actions" that can be done by a user on a given HTML Element. This enum class is
 * referred to while performing UI Logging.
 * 
 */
enum UIActions {
    CLICKED("Clicked "), 
    CHECKED("Checked "), 
    UNCHECKED("Un-checked "), 
    SELECTED("Selected "), 
    ENTERED("Entered "), 
    CLEARED("Cleared text ");
    
    private UIActions(String action) {
        this.action = action;
    }

    private String action;

    public String getAction() {
        return this.action;
    }

}
