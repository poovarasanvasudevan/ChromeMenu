# ChromeMenu

The menu from [Chromium](https://github.com/chromium/chromium) Android. It can do this:

![Example GIF](https://github.com/DeweyReed/ChromeMenu/blob/master/images/example.gif?raw=true)

Notice **the press, move, selection, up are finished in one gesture**.

I love this design. It significantly improves the efficiency of using an app. So I dig into chromium, extract related code and bundle them into this library.

## Usage

1. Set up touch listener

    ```Kotlin
    val handler = AppMenuHandler(activity, listener, R.menu.menu)
    val helper = AppMenuButtonHelper(handler)
    btn.setOnTouchListener(helper)
    ```

    `listener` is an [AppMenuPropertiesDelegate](https://github.com/DeweyReed/ChromeMenu/blob/master/library/src/main/java/xyz/aprildown/chromemenu/AppMenuPropertiesDelegate.java#L15) interface or use its abstract version [AbstractAppMenuPropertiesDelegate()](https://github.com/DeweyReed/ChromeMenu/blob/master/library/src/main/java/xyz/aprildown/chromemenu/AbstractAppMenuPropertiesDelegate.java#L12)

1. Handle click events

    All events are sent to activity's `onOptionsItemSelected`. So override it in the activity.

    ```Kotlin
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        ...
    }
    ```

1. Check the sample for more customization.