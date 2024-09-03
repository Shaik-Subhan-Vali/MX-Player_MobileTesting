const { TouchAction } = require('@wdio/mobile'); // Use WebDriverIO's mobile support

describe('Mx Player', () => {

    it('Actions', async () => {
        // Launch the MX Player app and click on the profile button
        await $('~com.mxtech.videoplayer.ad:id/me_tab').click();

        // Scrolling to the network stream button using WebDriverIO's scroll command
        await browser.execute('mobile: scroll', { direction: 'down' });

        // Clicking on the network stream button
        await $('//android.widget.TextView[@resource-id="com.mxtech.videoplayer.ad:id/name" and @text="Network Stream"]').click();

        // Entering the URL in the URL field
        await $('com.mxtech.videoplayer.ad:id/et_url').setValue("Hello, This is my url!");
    });

    it('Open Notification Panel', async () => {

        // Open the notification panel
        // Perform a swipe-down gesture to open the notifications
        await browser.touchAction([
            { action: 'press', x: 500, y: 100 },
            { action: 'moveTo', x: 500, y: 1500 },
            { action: 'release' }
        ]);

        // Tap on battery saver by coordinates
        await browser.touchAction([
            { action: 'tap', x: 634, y: 135 }
        ]);
    });

    it('Switching', async () => {
        // Start ApiDemos activity
        await browser.startActivity('io.appium.android.apis', 'io.appium.android.apis.ApiDemos');

        // Verify the text in the App section
        const txt = await $('//android.widget.TextView[@content-desc="App"]').getText();

        console.log(txt);

        await driver.startActivity('com.mxtech.videoplayer.ad','coma.mxtech.videoplayer.ad.ActivityWelcomeMX');

        await $('android = new UiSelector().className("android.widget.ImageView").instance(0)').click();


    });
});

