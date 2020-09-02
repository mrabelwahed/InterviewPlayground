# Android Interview Tips and Playground

## Activity Life Cycle 
  which life cycle methods will get called in every situation?
  - Launch First Activity
  - Launch Second Activity
  - Press Back Button from First Activity
  - Press Back Button from Second Activity
  - Put App In Background for First Activity option
  - Resume App In Foreground for First Activity option
  - Kill The App when First Activity on Foreground
  - Rotate Screen for  First Activity Option
  - when onDestroy() get called without call onPause() and on Stop()
  - how many times onCreate() is called during Activity is opened
  
  - Answer : check this image ![Android Life Cycle](https://media.geeksforgeeks.org/wp-content/uploads/20191125165133/Activity-Lifecycle-in-Android.jpg)
  
 ## Activity State Change
 - When onSavedInstance(Bundle savedInstance) is called?
 - Does onSavedInstance method is called when i call finis() method in activity?
 - Does onSavedInstance method is called when i press Back Button?
 - Does SavedInstance save heavy objects (large data set) or primitives data only?
 - which methods can you use to restore savedInstance object ?
 - When system call onRestoreInstanceState method?
 - what will happen when add Edit text without id and rotate the screen?
 
 - Answer : check this link ![Saving UI State](https://developer.android.com/guide/components/activities/activity-lifecycle#java)
  
  ## Fragment
  - what is fragment?
  - what are the ways to add fragment in your activity?
  - can you replace static fragment or not?
  - how to create static fragment?
  - how to create dynamic fragment?
  - describe life cycle for fragment?
  - describe the fragment lifecycle methods that will be called when the activity with the fragment start?
  - describe the fragment lifecycle methods that will be called when user press back button?
  - which one is called  first, onStart for fragment or the activity?
  - which one is called  first, onResume for fragment or the activity?
  - which one is called  first, onStop for fragment or the activity?
  - which one is called  first, onPause for fragment or the activity?
  - what will happen if you press back button for activity with fragment without adding fragment to back stack?
  - what will happen if you press back button for activity with fragment with adding fragment to back stack?
  - does fragment have back stack like activity?
  - what is the difference between back stack for fragment and back stack for activity?
  - what is the back stack count if you try to add three fragments without using addToBackStack()method?
  - what is the meaning of addToBackStack(null)?
  - what is difference between add and replace in back stack transaction?
  - does back stack is stack of fragments or transaction?
  - what will be tha back stack count if you add three fragments and then press back stack 3 times?
  - what is the difference between popStack method and remove for fragment back stack?
 
 
 
 
  - Answer : check this link ![fragment](https://www.youtube.com/watch?v=NCaomVCURDM&list=PLfuE3hOAeWhZDH-wHD0BJsJl7PpEW-wN8&index=1)