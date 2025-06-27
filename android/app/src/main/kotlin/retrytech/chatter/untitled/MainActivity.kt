package com.retrytech.chatter.untitled

import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugins.GeneratedPluginRegistrant // این خط را اضافه می کنیم

class MainActivity : FlutterActivity() {
    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        // این خط بسیار مهم است:
        // GeneratedPluginRegistrant.registerWith(flutterEngine)
        // تمام پلاگین ها را به صورت خودکار رجیستر می کند.
        // نباید پلاگین ها را دستی اضافه کرد.
        GeneratedPluginRegistrant.registerWith(flutterEngine) // این خط را اضافه یا مطمئن می شویم که وجود دارد
    }
}
