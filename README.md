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
 - Does save heavy objects or large data set in saved instance or primitives data only?
 - which methods can you use to restore savedInstance object ?
 - When system call onRestoreInstanceState method?
 - what will happen when add Edit text without id and rotate the screen?
 
 -Answer : check this link ![Saving UI State](https://developer.android.com/guide/components/activities/activity-lifecycle#java)
  