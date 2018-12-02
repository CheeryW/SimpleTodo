Time spent: **3** hours spent in total

## User Stories

The following **required** functionality is completed:

* [x] User can **view a list of todo items**
* [x] User can **successfully add and remove items** from the todo list
* [x] User's **list of items persisted** upon modification and and retrieved properly on app restart

The following **optional** features are implemented:

* [x] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='http://g.recordit.co/Y1wUbWF2kd.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with RecordIt.

## Notes

I initially named the EditActivity.java EditText.java, which is not good because it is also a variable type name in Android. 
When I defined EditText variables in this file, I saw this problem and renamed the file with the refactor function. Although 
I was sure my java and xml codes are correct, the app kept crashing when entering EditActivity page. I then refered to this 
page for debugging: https://hackmd.io/s/r1bhe4La7#My-app-is-crashing-with-a-dialog-and-then-exits. I found my problem was 
because the file name in AndroidManifest.xml didn't change to EditActivity, so I changed it manually and my code works now.

## License

    Copyright [yyyy] [CheeryW]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
