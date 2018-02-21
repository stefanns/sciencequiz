02-21 22:32:35.418 1326-1326/? E/hwservicemanager: BINDER_SET_INHERIT_FIFO_PRIO failed with error -1
02-21 22:32:35.439 1334-1334/? E/TrustyKeymaster: calling trusty_keymaster_connect
02-21 22:32:35.439 1334-1334/? E/TrustyKeymaster: failed to open KeymasterService3 pipe service
02-21 22:32:35.439 1334-1334/? E/TrustyKeymaster: calling trusty_keymaster_connect failed
                                                  
                                                  
                                                  --------- beginning of system
02-21 22:32:35.453 1335-1339/? E/vold: Failed to chmod /data/system_ce/0: No such file or directory
02-21 22:32:35.453 1335-1339/? E/vold: Failed to chmod /data/misc_ce/0: No such file or directory
02-21 22:32:35.453 1335-1339/? E/vold: Failed to chmod /data/media/0: No such file or directory
02-21 22:32:35.629 1383-1383/? E/GoldfishGatekeeper: called goldfish_gatekeeper_open with gate keeper 0xaac9c188 device 0xaa8ad088
02-21 22:32:35.663 1390-1390/? A/libc: unable to stat "/proc/self/exe": Permission denied
02-21 22:32:35.663 1390-1390/? A/libc: Fatal signal 6 (SIGABRT), code -6 in tid 1390 (init.ranchu-cor), pid 1390 (init.ranchu-cor)
02-21 22:32:35.726 1386-1386/? E/hwcomposer: unknown display attribute 6
02-21 22:32:35.741 1399-1399/? E/libc: failed to connect to tombstoned: No such file or directory
02-21 22:32:35.745 1399-1399/? A/DEBUG: *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
02-21 22:32:35.745 1399-1399/? A/DEBUG: Build fingerprint: 'google/sdk_gphone_x86/generic_x86:8.1.0/OPM1.171004.001/4376136:user/release-keys'
02-21 22:32:35.745 1399-1399/? A/DEBUG: Revision: '0'
02-21 22:32:35.746 1399-1399/? A/DEBUG: ABI: 'x86'
02-21 22:32:35.746 1399-1399/? A/DEBUG: pid: 1390, tid: 1390, name: init.ranchu-cor  >>> /system/bin/sh <<<
02-21 22:32:35.746 1399-1399/? A/DEBUG: signal 6 (SIGABRT), code -6 (SI_TKILL), fault addr --------
02-21 22:32:35.746 1399-1399/? A/DEBUG: Abort message: 'unable to stat "/proc/self/exe": Permission denied'
02-21 22:32:35.746 1399-1399/? A/DEBUG:     eax 00000000  ebx 0000056e  ecx 0000056e  edx 00000006
02-21 22:32:35.746 1399-1399/? A/DEBUG:     esi 00000000  edi 0000056e
02-21 22:32:35.746 1399-1399/? A/DEBUG:     xcs 00000073  xds 0000007b  xes 0000007b  xfs 00000000  xss 0000007b
02-21 22:32:35.746 1399-1399/? A/DEBUG:     eip aaf29ac4  ebp bfd6f754  esp bfd6f6e8  flags 00000292
02-21 22:32:35.756 1399-1399/? A/DEBUG: backtrace:
02-21 22:32:35.756 1399-1399/? A/DEBUG:     #00 pc 00000ac4  [vdso:aaf29000] (__kernel_vsyscall+16)
02-21 22:32:35.756 1399-1399/? A/DEBUG:     #01 pc 000bab48  /system/bin/linker (__dl_syscall+40)
02-21 22:32:35.756 1399-1399/? A/DEBUG:     #02 pc 000bac73  /system/bin/linker (__dl_abort+115)
02-21 22:32:35.756 1399-1399/? A/DEBUG:     #03 pc 0001bff5  /system/bin/linker (__dl___linker_init+4325)
02-21 22:32:35.756 1399-1399/? A/DEBUG:     #04 pc 00023a33  /system/bin/linker (__dl__start+35)
02-21 22:32:35.758 1399-1399/? A/DEBUG:     #05 pc 00000001  <unknown>
02-21 22:32:35.763 1399-1399/? E/crash_dump32: unable to connect to activity manager: No such file or directory
02-21 22:32:35.777 1375-1375/? E/EmulatedCamera_Factory: 2 cameras are being emulated. 0 of them are fake cameras.
02-21 22:32:35.777 1375-1375/? E/EmulatedCamera_HotplugThread: createFileIfNotExists: Could not create file '/data/misc/media/emulator.camera.hotplug.0', error: 'Permission denied' (13)
02-21 22:32:35.777 1375-1375/? E/EmulatedCamera_HotplugThread: createFileIfNotExists: Could not create file '/data/misc/media/emulator.camera.hotplug.1', error: 'Permission denied' (13)
02-21 22:32:35.778 1375-1375/? E/CamProvider@2.4-impl: setUpVendorTags: Vendor tag operations not fully defined. Ignoring definitions.
02-21 22:32:35.778 1375-1375/? E/CamProvider@2.4-impl: initialize: Vendor tag setup failed, will not be available.
02-21 22:32:35.851 1374-1374/? E/SoundTriggerHalImpl: couldn't load sound trigger module sound_trigger.primary (No such file or directory)
02-21 22:32:35.851 1393-1393/? E/vndksupport: Could not load /vendor/lib/egl/libGLES_emulation.so from sphal namespace: dlopen failed: library "/vendor/lib/egl/libGLES_emulation.so" not found.
02-21 22:32:35.851 1393-1393/? E/libEGL: load_driver(/vendor/lib/egl/libGLES_emulation.so): unknown
02-21 22:32:36.491 1393-1409/? E/SurfaceFlinger: ro.sf.lcd_density must be defined as a build property
02-21 22:32:36.496 1425-1443/? E/vndksupport: Could not load /vendor/lib/egl/libGLES_emulation.so from sphal namespace: dlopen failed: library "/vendor/lib/egl/libGLES_emulation.so" not found.
02-21 22:32:36.496 1425-1443/? E/libEGL: load_driver(/vendor/lib/egl/libGLES_emulation.so): unknown
02-21 22:32:36.814 1425-1449/? E/BootAnimation: Could not add watch for /data/system
02-21 22:32:37.706 1460-1460/? E/CameraService: onDeviceStatusChanged: State transition to the same status 0x1 not allowed
02-21 22:32:37.707 1460-1460/? E/CameraService: onDeviceStatusChanged: State transition to the same status 0x1 not allowed
02-21 22:32:37.711 1460-1486/? E/CameraService: onDeviceStatusChanged: State transition to the same status 0x1 not allowed
02-21 22:32:37.711 1460-1486/? E/CameraService: onDeviceStatusChanged: State transition to the same status 0x1 not allowed
02-21 22:32:37.973 1374-1505/? E/EffectsConfig: Failed to parse /vendor/etc/audio_effects.xml: Tinyxml2 error (3): /vendor/etc/audio_effects.xml (null)
02-21 22:32:37.973 1374-1505/? E/EffectsFactoryConfigLoader: Failed to parse XML configuration file
02-21 22:32:37.990 1459-1459/? E/EffectsConfig: Failed to parse /vendor/etc/audio_effects.xml: Tinyxml2 error (3): /vendor/etc/audio_effects.xml (null)
02-21 22:32:37.994 1459-1459/? E/SoundTriggerHwService: could not read implementation properties
02-21 22:32:38.071 1468-1468/? E/Netd: cannot find interface dummy0
02-21 22:32:38.082 1468-1468/? E/Netd: Unable to create netlink socket: Protocol not supported
02-21 22:32:38.817 1458-1458/? E/ActivityRecognitionHardware: activity_recognition HAL is deprecated. class_init is effectively a no-op
02-21 22:32:41.758 1469-1493/? E//system/bin/storaged: getService package_native failed
02-21 22:32:42.636 1470-1470/? E/wificond: Failed to stop supplicant
02-21 22:32:47.911 1458-1458/? E/vndksupport: Could not load /vendor/lib/egl/libGLES_emulation.so from sphal namespace: dlopen failed: library "/vendor/lib/egl/libGLES_emulation.so" not found.
02-21 22:32:47.911 1458-1458/? E/libEGL: load_driver(/vendor/lib/egl/libGLES_emulation.so): unknown
02-21 22:32:47.926 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-as.hyb not found or unreadable
02-21 22:32:47.926 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-bg.hyb not found or unreadable
02-21 22:32:47.926 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-bn.hyb not found or unreadable
02-21 22:32:47.926 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-cu.hyb not found or unreadable
02-21 22:32:47.926 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-cy.hyb not found or unreadable
02-21 22:32:47.926 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-da.hyb not found or unreadable
02-21 22:32:47.927 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-de-1901.hyb not found or unreadable
02-21 22:32:47.927 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-de-1996.hyb not found or unreadable
02-21 22:32:47.927 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-de-ch-1901.hyb not found or unreadable
02-21 22:32:47.927 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-en-gb.hyb not found or unreadable
02-21 22:32:47.927 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-en-us.hyb not found or unreadable
02-21 22:32:47.927 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-es.hyb not found or unreadable
02-21 22:32:47.927 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-et.hyb not found or unreadable
02-21 22:32:47.927 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-eu.hyb not found or unreadable
02-21 22:32:47.927 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-fr.hyb not found or unreadable
02-21 22:32:47.927 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-ga.hyb not found or unreadable
02-21 22:32:47.927 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-gu.hyb not found or unreadable
02-21 22:32:47.928 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-hi.hyb not found or unreadable
02-21 22:32:47.928 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-hr.hyb not found or unreadable
02-21 22:32:47.928 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-hu.hyb not found or unreadable
02-21 22:32:47.928 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-hy.hyb not found or unreadable
02-21 22:32:47.928 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-kn.hyb not found or unreadable
02-21 22:32:47.928 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-ml.hyb not found or unreadable
02-21 22:32:47.928 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-mn-cyrl.hyb not found or unreadable
02-21 22:32:47.928 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-mr.hyb not found or unreadable
02-21 22:32:47.928 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-nb.hyb not found or unreadable
02-21 22:32:47.928 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-nn.hyb not found or unreadable
02-21 22:32:47.928 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-or.hyb not found or unreadable
02-21 22:32:47.928 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-pa.hyb not found or unreadable
02-21 22:32:47.928 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-pt.hyb not found or unreadable
02-21 22:32:47.928 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-sl.hyb not found or unreadable
02-21 22:32:47.928 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-ta.hyb not found or unreadable
02-21 22:32:47.928 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-te.hyb not found or unreadable
02-21 22:32:47.928 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-tk.hyb not found or unreadable
02-21 22:32:47.929 1458-1458/? E/Hyphenator: hyphenation patterns for /system/usr/hyphen-data/hyph-und-ethi.hyb not found or unreadable
02-21 22:32:48.034 1458-1458/? E/Zygote: couldn't write 1538 to /dev/memcg/system/tasks
02-21 22:32:48.355 1538-1555/? E/BluetoothAdapter: Bluetooth binder is null
02-21 22:32:48.363 1538-1555/? E/BatteryExternalStatsWorker: no controller energy info supplied for telephony
02-21 22:32:48.366 1538-1555/? E/KernelUidCpuFreqTimeReader: Failed to read /proc/uid_time_in_state: java.io.FileNotFoundException: /proc/uid_time_in_state (No such file or directory)
02-21 22:32:48.366 1538-1555/? E/KernelCpuSpeedReader: Failed to read cpu-freq: /sys/devices/system/cpu/cpu0/cpufreq/stats/time_in_state (No such file or directory)
02-21 22:32:48.397 1538-1538/? E/memtrack: Couldn't load memtrack module
02-21 22:32:48.453 1393-1451/? E/SurfaceFlinger: ro.sf.lcd_density must be defined as a build property
02-21 22:32:48.454 1538-1559/? E/LocalDisplayAdapter: Default and active color mode is no longer available! Reverting to first available mode.
02-21 22:32:48.460 1538-1559/? E/LightsService: Unable to get ILight interface.
02-21 22:32:49.248 1538-1586/? E/SensorService: Reported power 0.000000 not deemed sane, clamping to 0.001000
02-21 22:32:49.321 1538-1550/? E/SystemServer: Unable to preload default resources
02-21 22:32:49.414 1538-1538/? E/VibratorService: vibratorOff command failed (1).
02-21 22:32:49.695 1538-1598/? E/EventHub: could not get driver version for /dev/input/mouse0, Not a typewriter
02-21 22:32:49.788 1538-1598/? E/EventHub: could not get driver version for /dev/input/mice, Not a typewriter
02-21 22:32:49.792 1538-1538/? E/zygote: service android.hardware.oemlock@1.0::IOemLock declares transport method EMPTY but framework expects hwbinder.
02-21 22:32:49.998 1538-1608/? E/HalDeviceManager: isSupported: called but mServiceManager is null!?
02-21 22:32:50.017 1538-1538/? E/SupplicantStaIfaceHal: Can't call setDebugParams, ISupplicant is null
02-21 22:32:50.145 1538-1538/? E/HardwarePropertiesManagerService-JNI: Unable to get Thermal service.
02-21 22:32:50.179 1538-1585/? E/ContextHubService: Could not load context hub hal
02-21 22:32:50.200 1476-1476/? E/FingerprintHal: Could not load fingerprints from storage at /data/system/users/0/fpdata/emufp.bin; it has not yet been created.
02-21 22:32:50.250 1538-1538/? E/zygote: service android.hardware.weaver@1.0::IWeaver declares transport method EMPTY but framework expects hwbinder.
02-21 22:32:50.251 1538-1538/? E/LockSettingsStorage: Cannot read file java.io.FileNotFoundException: /data/system/gatekeeper.password.key: open failed: ENOENT (No such file or directory)
02-21 22:32:50.251 1538-1538/? E/LockSettingsStorage: Cannot read file java.io.FileNotFoundException: /data/system/password.key: open failed: ENOENT (No such file or directory)
02-21 22:32:50.251 1538-1538/? E/LockSettingsStorage: Cannot read file java.io.FileNotFoundException: /data/system/gatekeeper.pattern.key: open failed: ENOENT (No such file or directory)
02-21 22:32:50.251 1538-1538/? E/LockSettingsStorage: Cannot read file java.io.FileNotFoundException: /data/system/gatekeeper.gesture.key: open failed: ENOENT (No such file or directory)
02-21 22:32:50.251 1538-1538/? E/LockSettingsStorage: Cannot read file java.io.FileNotFoundException: /data/system/gesture.key: open failed: ENOENT (No such file or directory)
02-21 22:32:50.476 1538-1538/? E/BitmapFactory: Unable to decode stream: java.io.FileNotFoundException: /data/system/users/0/wallpaper_orig (No such file or directory)
02-21 22:32:50.476 1538-1538/? E/WallpaperManagerService: Unable to apply new wallpaper
02-21 22:32:50.504 1538-1620/? E/BluetoothAdapter: Bluetooth binder is null
02-21 22:32:50.505 1538-1620/? E/BluetoothAdapter: Bluetooth binder is null
02-21 22:32:50.544 1538-1555/? E/BatteryExternalStatsWorker: no controller energy info supplied for wifi
02-21 22:32:50.544 1538-1555/? E/BatteryExternalStatsWorker: no controller energy info supplied for telephony
02-21 22:32:50.820 1384-1384/? E/GnssHAL_GnssInterface: getExtensionXtra GnssXtra interface not implemented by HAL
02-21 22:32:50.821 1384-1384/? E/GnssHAL_GnssInterface: getExtensionAGnssRil GnssRil interface not implemented by GNSS HAL
02-21 22:32:50.821 1384-1384/? E/GnssHAL_GnssInterface: getExtensionAGnss AGnss interface not implemented by GNSS HAL
02-21 22:32:50.822 1384-1384/? E/GnssHAL_GnssInterface: getExtensionGnssNavigationMessage GnssNavigationMessage interface not implemented by GNSS HAL
02-21 22:32:50.823 1384-1384/? E/GnssHAL_GnssInterface: getExtensionGnssMeasurement GnssMeasurement interface not implemented by GNSS HAL
02-21 22:32:50.824 1384-1384/? E/GnssHAL_GnssInterface: getExtensionGnssDebug: GnssDebug interface is not implemented by HAL
02-21 22:32:50.825 1384-1384/? E/GnssHAL_GnssInterface: getExtensionGnssNi GnssNi interface not implemented by GNSS HAL
02-21 22:32:50.826 1384-1384/? E/GnssHAL_GnssInterface: getExtensionGnssConfiguration GnssConfiguration interface not implemented by GNSS HAL
02-21 22:32:50.826 1384-1384/? E/GnssHAL_GnssInterface: getExtensionGnssGeofencing GnssGeofencing interface not implemented by GNSS HAL
02-21 22:32:50.827 1384-1384/? E/GnssHAL_GnssInterface: gnss flp hw_get_module failed: -2
02-21 22:32:50.827 1384-1384/? E/GnssHAL_GnssInterface: getExtensionGnssBatching: GnssBatching interface is not implemented by HAL
02-21 22:32:50.837 1538-1538/? E/GnssLocationProvider: Unable to initialize GNSS Xtra interface
02-21 22:32:50.837 1538-1538/? E/GnssLocationProvider: Unable to Initialize AGnss interface
02-21 22:32:50.837 1538-1538/? E/GnssLocationProvider: Unable to initialize GNSS Geofencing interface
02-21 22:32:50.837 1538-1538/? E/GnssLocationProvider: Unable to initialize GNSS NI interface
02-21 22:32:50.846 1538-1538/? E/ActivityRecognitionHardware: activity_recognition HAL is deprecated. is_supported is effectively a no-op
02-21 22:32:51.007 1471-1499/? E/OMXNodeInstance: getExtensionIndex(0xaaca0960:google.h264.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
02-21 22:32:51.007 1471-1499/? E/OMXNodeInstance: getExtensionIndex(0xaaca0960:google.h264.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
02-21 22:32:51.025 1471-1499/? E/OMXNodeInstance: getExtensionIndex(0xaaca0960:google.h263.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
02-21 22:32:51.026 1471-1499/? E/OMXNodeInstance: getExtensionIndex(0xaaca0960:google.h263.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
02-21 22:32:51.045 1471-1499/? E/OMXNodeInstance: getExtensionIndex(0xaaca0960:google.hevc.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
02-21 22:32:51.045 1471-1499/? E/OMXNodeInstance: getExtensionIndex(0xaaca0960:google.hevc.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
02-21 22:32:51.054 1471-1499/? E/OMXNodeInstance: getExtensionIndex(0xaaca0960:google.mpeg4.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
02-21 22:32:51.054 1471-1499/? E/OMXNodeInstance: getExtensionIndex(0xaaca0960:google.mpeg4.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
02-21 22:32:51.091 1471-1499/? E/OMXNodeInstance: getExtensionIndex(0xaaca0960:google.vp8.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
02-21 22:32:51.091 1471-1499/? E/OMXNodeInstance: getExtensionIndex(0xaaca0960:google.vp8.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
02-21 22:32:51.113 1471-1499/? E/OMXNodeInstance: getExtensionIndex(0xaaca0960:google.vp9.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
02-21 22:32:51.113 1471-1499/? E/OMXNodeInstance: getExtensionIndex(0xaaca0960:google.vp9.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
02-21 22:32:51.142 1471-1499/? E/OMXNodeInstance: getConfig(0xaaca0960:google.h263.encoder, ConfigAndroidIntraRefresh(0x6f60000a)) ERROR: Undefined(0x80001001)
02-21 22:32:51.146 1471-1499/? E/OMXNodeInstance: getConfig(0xaaca0960:google.mpeg4.encoder, ConfigAndroidIntraRefresh(0x6f60000a)) ERROR: Undefined(0x80001001)
02-21 22:32:51.169 1471-1499/? E/OMXNodeInstance: getConfig(0xaaca0960:google.vp8.encoder, ConfigAndroidIntraRefresh(0x6f60000a)) ERROR: Undefined(0x80001001)
02-21 22:32:51.195 1471-1499/? E/OMXNodeInstance: getConfig(0xaaca0960:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
02-21 22:32:51.233 1538-1538/? E/BluetoothAdapter: Bluetooth binder is null
02-21 22:32:51.287 1393-1450/? E/SurfaceFlinger: ro.sf.lcd_density must be defined as a build property
02-21 22:32:51.290 1538-1538/? E/BluetoothAdapter: Bluetooth binder is null
02-21 22:32:51.299 1538-1538/? E/BluetoothAdapter: Bluetooth binder is null
02-21 22:32:51.375 1471-1499/? E/OMXNodeInstance: getConfig(0xaaca0960:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
02-21 22:32:51.378 1393-1409/? E/SurfaceFlinger: ro.sf.lcd_density must be defined as a build property
02-21 22:32:51.392 1471-1499/? E/OMXNodeInstance: getConfig(0xaa81f060:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
02-21 22:32:51.428 1538-1538/? E/WiredAccessoryManager: No state change.
02-21 22:32:51.554 1538-1618/? E/ActivityThread: Failed to find provider info for com.android.calendar
02-21 22:32:51.570 1538-1618/? E/ActivityThread: Failed to find provider info for com.android.calendar
02-21 22:32:51.580 1471-1805/? E/OMXNodeInstance: getConfig(0xaaca0960:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
02-21 22:32:51.669 1471-1499/? E/OMXNodeInstance: getConfig(0xaa81f360:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
02-21 22:32:51.720 1471-1701/? E/OMXNodeInstance: getConfig(0xaaca0900:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
02-21 22:32:51.853 1471-1805/? E/OMXNodeInstance: getConfig(0xaa81f360:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
02-21 22:32:51.855 1471-1805/? E/OMXNodeInstance: getConfig(0xaaca0a80:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
02-21 22:32:51.992 1393-1450/? E/SurfaceFlinger: ro.sf.lcd_density must be defined as a build property
02-21 22:32:52.015 1471-1805/? E/OMXNodeInstance: getConfig(0xaa81f300:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
02-21 22:32:52.048 1538-1551/? E/GnssLocationProvider: no AGPS interface in set_agps_server
02-21 22:32:52.069 1538-1551/? E/GnssLocationProvider: Unable to initialize GNSS Xtra interface
02-21 22:32:52.069 1538-1551/? E/GnssLocationProvider: Unable to Initialize AGnss interface
02-21 22:32:52.069 1538-1551/? E/GnssLocationProvider: Unable to initialize GNSS Geofencing interface
02-21 22:32:52.069 1538-1551/? E/GnssLocationProvider: Unable to initialize GNSS NI interface
02-21 22:32:52.069 1538-1551/? E/GnssLocationProvider: no AGPS interface in set_agps_server
02-21 22:32:52.069 1538-1551/? E/GnssLocationProvider: Failed to initialize GNSS batching
02-21 22:32:52.133 1716-1716/? E/BluetoothAdapter: Bluetooth binder is null
02-21 22:32:52.164 1716-1861/? E/ActivityThread: Failed to find provider info for com.android.contacts
02-21 22:32:40.595 1538-1618/? E/ActivityThread: Failed to find provider info for com.android.calendar
02-21 22:32:40.595 1538-1618/? E/ActivityThread: Failed to find provider info for com.android.calendar
02-21 22:32:40.928 1716-1716/? E/PhoneInterfaceManager: [PhoneIntfMgr] getIccId: No UICC
02-21 22:32:41.069 1644-1644/? E/BluetoothAdapter: Bluetooth binder is null
02-21 22:32:41.089 1716-1716/? E/PhoneInterfaceManager: [PhoneIntfMgr] getIccId: No UICC
02-21 22:32:41.178 1644-1854/? E/ActivityThread: Failed to find provider info for com.android.contacts
02-21 22:32:41.246 1538-1732/? E/PowerManagerService: Failed to read last_reboot_reason file
                                                      java.io.FileNotFoundException: /data/misc/reboot/last_reboot_reason (No such file or directory)
                                                          at java.io.FileInputStream.open0(Native Method)
                                                          at java.io.FileInputStream.open(FileInputStream.java:200)
                                                          at java.io.FileInputStream.<init>(FileInputStream.java:150)
                                                          at java.io.FileReader.<init>(FileReader.java:72)
                                                          at com.android.server.power.PowerManagerService.getLastShutdownReasonInternal(PowerManagerService.java:4641)
                                                          at com.android.server.power.PowerManagerService$BinderService.getLastShutdownReason(PowerManagerService.java:4405)
                                                          at android.os.IPowerManager$Stub.onTransact(IPowerManager.java:302)
                                                          at android.os.Binder.execTransact(Binder.java:697)
02-21 22:32:41.270 1716-1716/? E/PhoneInterfaceManager: [PhoneIntfMgr] getIccId: No UICC
02-21 22:32:41.537 1393-1451/? E/SurfaceFlinger: ro.sf.lcd_density must be defined as a build property
02-21 22:32:41.654 1538-1551/? E/GnssLocationProvider: no AGPS interface in set_agps_server
02-21 22:32:41.659 1644-1854/? E/ActivityThread: Failed to find provider info for com.android.contacts
02-21 22:32:41.704 1538-1551/? E/GnssLocationProvider: no AGPS interface in set_agps_server
02-21 22:32:41.715 1644-1859/? E/ActivityThread: Failed to find provider info for com.android.contacts
02-21 22:32:41.738 1538-1551/? E/GnssLocationProvider: no AGPS interface in set_agps_server
02-21 22:32:41.775 1538-1551/? E/GnssLocationProvider: no AGPS interface in set_agps_server
02-21 22:32:41.896 1538-1551/? E/GnssLocationProvider: no AGPS interface in set_agps_server
02-21 22:32:42.224 1468-1530/? E/Netd: Error adding route ::/0 -> fe80::2 eth0 to table 1002: File exists
02-21 22:32:42.289 1937-1937/? E/ActivityThread: Failed to find provider info for com.google.android.gsf.gservices
02-21 22:32:42.305 1937-1937/? E/ActivityThread: Failed to find provider info for com.google.android.gsf.gservices
02-21 22:32:42.361 1937-1957/? E/GmsClient: unable to connect to service: com.google.android.gms.clearcut.service.START on com.google.android.gms
02-21 22:32:42.373 1937-1957/? E/GmsClient: unable to connect to service: com.google.android.gms.phenotype.service.START on com.google.android.gms
02-21 22:32:42.397 1937-1937/? E/ActivityThread: Failed to find provider info for com.google.android.gsf.gservices
02-21 22:32:42.423 1937-1957/? E/GmsClient: unable to connect to service: com.google.android.gms.clearcut.service.START on com.google.android.gms
02-21 22:32:45.547 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.548 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.548 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.550 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.609 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.612 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.613 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.616 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.663 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.668 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.721 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.738 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.740 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.762 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.770 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.775 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.779 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.782 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.786 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.854 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.859 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.887 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.904 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.915 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:45.976 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.044 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.069 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.188 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.224 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.247 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.281 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.303 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.306 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.311 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.319 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.328 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.346 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.353 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.354 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.356 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.363 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.366 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.368 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.369 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.371 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.373 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.374 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.394 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.396 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.397 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:46.529 2034-2076/? E/QsbUiManager: Unable to register for configuration changes, UI changes will be reset
02-21 22:32:46.537 2034-2076/? E/ActivityThread: Failed to find provider info for com.google.android.googlequicksearchbox.GsaPublicContentProvider
02-21 22:32:47.311 1538-1551/? E/GnssLocationProvider: no AGPS interface in set_agps_server
02-21 22:32:47.458 2101-2101/? E/OverlaySController: Calling with an invalid UID, the interface will not work
02-21 22:32:47.458 2101-2101/? E/OverlaySController: Invalid version
02-21 22:32:47.516 1393-1408/? E/SurfaceFlinger: ro.sf.lcd_density must be defined as a build property
02-21 22:32:47.796 1393-1408/? E/SurfaceFlinger: ro.sf.lcd_density must be defined as a build property
02-21 22:32:48.847 1393-1933/? E/SurfaceFlinger: ro.sf.lcd_density must be defined as a build property
02-21 22:32:49.372 1393-1408/? E/SurfaceFlinger: ro.sf.lcd_density must be defined as a build property
02-21 22:32:50.413 2101-2215/? E/ActivityThread: Failed to find provider info for com.google.android.apps.gsa.testing.ui.audio.recorded
02-21 22:32:51.709 2000-2491/? E/BluetoothAdapter: Bluetooth binder is null
02-21 22:32:52.680 1462-1581/? E/installd: Failed to delete /data/app/vmdl1646508626.tmp: No such file or directory
02-21 22:32:53.139 1393-1450/? E/SurfaceFlinger: ro.sf.lcd_density must be defined as a build property
02-21 22:32:53.186 1393-1450/? E/SurfaceFlinger: ro.sf.lcd_density must be defined as a build property
02-21 22:32:53.533 2558-2558/? E/AndroidRuntime: FATAL EXCEPTION: main
                                                 Process: com.example.android.sciencequiz, PID: 2558
                                                 java.lang.RuntimeException: Unable to start activity ComponentInfo{com.example.android.sciencequiz/com.example.android.sciencequiz.MainActivity}: android.view.InflateException: Binary XML file line #0: Binary XML file line #0: Error inflating class TextView
                                                     at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2778)
                                                     at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2856)
                                                     at android.app.ActivityThread.-wrap11(Unknown Source:0)
                                                     at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1589)
                                                     at android.os.Handler.dispatchMessage(Handler.java:106)
                                                     at android.os.Looper.loop(Looper.java:164)
                                                     at android.app.ActivityThread.main(ActivityThread.java:6494)
                                                     at java.lang.reflect.Method.invoke(Native Method)
                                                     at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
                                                     at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:807)
                                                  Caused by: android.view.InflateException: Binary XML file line #0: Binary XML file line #0: Error inflating class TextView
                                                  Caused by: android.view.InflateException: Binary XML file line #0: Error inflating class TextView
                                                  Caused by: java.lang.RuntimeException: java.lang.reflect.InvocationTargetException
                                                     at android.support.v4.graphics.TypefaceCompatApi26Impl.addFontFromAssetManager(TypefaceCompatApi26Impl.java:150)
                                                     at android.support.v4.graphics.TypefaceCompatApi26Impl.createFromFontFamilyFilesResourceEntry(TypefaceCompatApi26Impl.java:218)
                                                     at android.support.v4.graphics.TypefaceCompat.createFromResourcesFamilyXml(TypefaceCompat.java:116)
                                                     at android.support.v4.content.res.ResourcesCompat.loadFont(ResourcesCompat.java:249)
                                                     at android.support.v4.content.res.ResourcesCompat.loadFont(ResourcesCompat.java:213)
                                                     at android.support.v4.content.res.ResourcesCompat.getFont(ResourcesCompat.java:206)
                                                     at android.support.v7.widget.TintTypedArray.getFont(TintTypedArray.java:119)
                                                     at android.support.v7.widget.AppCompatTextHelper.updateTypefaceAndStyle(AppCompatTextHelper.java:208)
                                                     at android.support.v7.widget.AppCompatTextHelper.loadFromAttributes(AppCompatTextHelper.java:152)
                                                     at android.support.v7.widget.AppCompatTextHelperV17.loadFromAttributes(AppCompatTextHelperV17.java:38)
                                                     at android.support.v7.widget.AppCompatTextView.<init>(AppCompatTextView.java:81)
                                                     at android.support.v7.widget.AppCompatTextView.<init>(AppCompatTextView.java:71)
                                                     at android.support.v7.app.AppCompatViewInflater.createView(AppCompatViewInflater.java:103)
                                                     at android.support.v7.app.AppCompatDelegateImplV9.createView(AppCompatDelegateImplV9.java:1024)
                                                     at android.support.v7.app.AppCompatDelegateImplV9.onCreateView(AppCompatDelegateImplV9.java:1081)
                                                     at android.view.LayoutInflater.createViewFromTag(LayoutInflater.java:772)
                                                     at android.view.LayoutInflater.createViewFromTag(LayoutInflater.java:730)
                                                     at android.view.LayoutInflater.rInflate(LayoutInflater.java:863)
                                                     at android.view.LayoutInflater.rInflateChildren(LayoutInflater.java:824)
                                                     at android.view.LayoutInflater.rInflate(LayoutInflater.java:866)
                                                     at android.view.LayoutInflater.rInflateChildren(LayoutInflater.java:824)
                                                     at android.view.LayoutInflater.rInflate(LayoutInflater.java:866)
                                                     at android.view.LayoutInflater.rInflateChildren(LayoutInflater.java:824)
                                                     at android.view.LayoutInflater.rInflate(LayoutInflater.java:866)
                                                     at android.view.LayoutInflater.rInflateChildren(LayoutInflater.java:824)
                                                     at android.view.LayoutInflater.inflate(LayoutInflater.java:515)
                                                     at android.view.LayoutInflater.inflate(LayoutInflater.java:423)
                                                     at android.view.LayoutInflater.inflate(LayoutInflater.java:374)
                                                     at android.support.v7.app.AppCompatDelegateImplV9.setContentView(AppCompatDelegateImplV9.java:287)
                                                     at android.support.v7.app.AppCompatActivity.setContentView(AppCompatActivity.java:139)
                                                     at com.example.android.sciencequiz.MainActivity.onCreate(MainActivity.java:55)
                                                     at android.app.Activity.performCreate(Activity.java:7000)
                                                     at android.app.Activity.performCreate(Activity.java:6991)
02-21 22:32:53.538 2558-2558/? E/AndroidRuntime:     at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1214)
                                                     at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2731)
                                                     at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2856)
                                                     at android.app.ActivityThread.-wrap11(Unknown Source:0)
                                                     at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1589)
                                                     at android.os.Handler.dispatchMessage(Handler.java:106)
                                                     at android.os.Looper.loop(Looper.java:164)
                                                     at android.app.ActivityThread.main(ActivityThread.java:6494)
                                                     at java.lang.reflect.Method.invoke(Native Method)
                                                     at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
                                                     at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:807)
                                                  Caused by: java.lang.reflect.InvocationTargetException
                                                     at java.lang.reflect.Method.invoke(Native Method)
                                                     at android.support.v4.graphics.TypefaceCompatApi26Impl.addFontFromAssetManager(TypefaceCompatApi26Impl.java:145)
                                                     	... 43 more
                                                  Caused by: java.lang.NullPointerException
                                                     at android.graphics.FontFamily.nAddFontFromAssetManager(Native Method)
                                                     at android.graphics.FontFamily.addFontFromAssetManager(FontFamily.java:149)
                                                     	... 45 more
02-21 22:32:54.246 2101-2215/? E/ActivityThread: Failed to find provider info for com.google.android.apps.gsa.testing.ui.audio.recorded
02-21 22:32:54.465 2598-2618/? E/Bugle: PhoneUtils.getValidE164Number(): Not able to parse phone number Redacted-14 for country US
02-21 22:32:55.345 2629-2629/? E/CarrierServices: [2] AutoStartReceiver.onReceive: JibeService cant be started... Neither Bugle is whitelisted,  nor cs apk is installed
02-21 22:32:55.799 2180-2665/? E/Icing: Lite index docid 83 ahead of clip 71
02-21 22:32:56.158 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:56.461 1538-1629/? E/TaskPersister: File error accessing recents directory (directory doesn't exist?).
02-21 22:32:56.539 2180-2665/? E/Icing: Aborting indexing of corpus playlists
02-21 22:32:56.549 2180-2665/? E/Icing: Aborting indexing of corpus top_tracks
02-21 22:32:56.733 2180-2665/? E/Icing: Aborting indexing of corpus partsCorpus
02-21 22:32:56.738 2180-2665/? E/Icing: Aborting indexing of corpus shows
02-21 22:32:56.739 2180-2665/? E/Icing: Aborting indexing of corpus top_artists
02-21 22:32:56.743 2180-2665/? E/Icing: Aborting indexing of corpus movies
02-21 22:32:56.764 2180-2665/? E/ProtoUtils: Invalid message size: 0 (buffer end is 1330)
02-21 22:32:57.550 2180-2665/? E/ProtoUtils: Invalid message size: 0 (buffer end is 1330)
02-21 22:32:57.585 2734-2734/? E/PrefServiceImpl: Primary account is null
02-21 22:32:57.609 2180-2665/? E/Icing: Aborting indexing of corpus participantsCorpus
02-21 22:32:57.641 2180-2665/? E/Icing: Aborting indexing of corpus suggest_query
02-21 22:32:57.671 2180-2665/? E/Icing: Aborting indexing of corpus artists
02-21 22:32:57.783 2180-2665/? E/Icing: Aborting indexing of corpus messagesCorpus
02-21 22:32:57.786 2771-2771/? E/ConfigUpdater: ignoring update request
02-21 22:32:57.791 2180-2665/? E/Icing: Aborting indexing of corpus top_albums
02-21 22:32:57.792 2771-2771/? E/ConfigUpdater: ignoring update request
02-21 22:32:57.807 2771-2771/? E/ConfigUpdater: ignoring update request
02-21 22:32:57.810 2180-2665/? E/Icing: Aborting indexing of corpus albums
02-21 22:32:57.815 2771-2771/? E/ConfigUpdater: ignoring update request
02-21 22:32:57.821 2771-2771/? E/ConfigUpdater: ignoring update request
02-21 22:32:57.826 2771-2771/? E/ConfigUpdater: ignoring update request
02-21 22:32:57.832 2180-2665/? E/Icing: Aborting indexing of corpus songs
02-21 22:32:57.850 2180-2665/? E/Icing: Aborting indexing of corpus omnibox
02-21 22:32:58.264 2180-2665/? E/ProtoUtils: Invalid message size: 0 (buffer end is 1330)
02-21 22:32:58.629 2180-2688/? E/ConfigFileUtils: Failed to read config file: /data/user_de/0/com.google.android.gms/app_chimera/current_modulesets.pb (No such file or directory)
02-21 22:32:58.813 2180-2688/? E/Auth: [NotificationChannelUtil] NotificationChannels reflection error
                                       java.lang.NoSuchMethodException: createNotificationChannelGroup [class android.app.NotificationChannelGroup]
                                           at java.lang.Class.getMethod(Class.java:2068)
                                           at java.lang.Class.getMethod(Class.java:1690)
                                           at gfv.a(:com.google.android.gms@11577470:11)
                                           at com.google.android.gms.auth.account.AuthInitIntentOperation.a(:com.google.android.gms@11577470:5)
                                           at kev.onHandleIntent(:com.google.android.gms@11577470:9)
                                           at com.google.android.chimera.IntentOperation.onHandleIntent(:com.google.android.gms@11577470:2)
                                           at bwh.run(:com.google.android.gms@11577470:10)
                                           at bwe.run(:com.google.android.gms@11577470:14)
                                           at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
                                           at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
                                           at java.lang.Thread.run(Thread.java:764)
02-21 22:32:58.813 2180-2688/? E/Auth: [NotificationChannelUtil] NotificationChannels reflection error
                                       java.lang.NoSuchMethodException: createNotificationChannel [class android.app.NotificationChannel]
                                           at java.lang.Class.getMethod(Class.java:2068)
                                           at java.lang.Class.getMethod(Class.java:1690)
                                           at gfv.a(:com.google.android.gms@11577470:29)
                                           at gfv.a(:com.google.android.gms@11577470:21)
                                           at com.google.android.gms.auth.account.AuthInitIntentOperation.a(:com.google.android.gms@11577470:5)
                                           at kev.onHandleIntent(:com.google.android.gms@11577470:9)
                                           at com.google.android.chimera.IntentOperation.onHandleIntent(:com.google.android.gms@11577470:2)
                                           at bwh.run(:com.google.android.gms@11577470:10)
                                           at bwe.run(:com.google.android.gms@11577470:14)
                                           at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
                                           at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
                                           at java.lang.Thread.run(Thread.java:764)
02-21 22:32:58.814 2180-2688/? E/Auth: [NotificationChannelUtil] NotificationChannels reflection error
                                       java.lang.NoSuchMethodException: createNotificationChannel [class android.app.NotificationChannel]
                                           at java.lang.Class.getMethod(Class.java:2068)
                                           at java.lang.Class.getMethod(Class.java:1690)
                                           at gfv.a(:com.google.android.gms@11577470:29)
                                           at gfv.a(:com.google.android.gms@11577470:25)
                                           at com.google.android.gms.auth.account.AuthInitIntentOperation.a(:com.google.android.gms@11577470:5)
                                           at kev.onHandleIntent(:com.google.android.gms@11577470:9)
                                           at com.google.android.chimera.IntentOperation.onHandleIntent(:com.google.android.gms@11577470:2)
                                           at bwh.run(:com.google.android.gms@11577470:10)
                                           at bwe.run(:com.google.android.gms@11577470:14)
                                           at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
                                           at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
                                           at java.lang.Thread.run(Thread.java:764)
02-21 22:32:58.815 2180-2688/? E/Auth: [NotificationChannelUtil] NotificationChannels reflection error
                                       java.lang.NoSuchMethodException: createNotificationChannel [class android.app.NotificationChannel]
                                           at java.lang.Class.getMethod(Class.java:2068)
                                           at java.lang.Class.getMethod(Class.java:1690)
                                           at gfv.a(:com.google.android.gms@11577470:29)
                                           at gfv.a(:com.google.android.gms@11577470:31)
                                           at com.google.android.gms.auth.account.AuthInitIntentOperation.a(:com.google.android.gms@11577470:5)
                                           at kev.onHandleIntent(:com.google.android.gms@11577470:9)
                                           at com.google.android.chimera.IntentOperation.onHandleIntent(:com.google.android.gms@11577470:2)
                                           at bwh.run(:com.google.android.gms@11577470:10)
                                           at bwe.run(:com.google.android.gms@11577470:14)
                                           at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
                                           at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
                                           at java.lang.Thread.run(Thread.java:764)
02-21 22:32:58.868 2000-2867/? E/InstantApps: HashPrefixFilterImpl: Not in sync with domain filter, getDomainsForPrefixes skipped
02-21 22:32:58.914 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:32:59.048 2180-2906/? E/libc: Access denied finding property "ro.runtime.firstboot"
02-21 22:32:59.199 2000-2000/? E/BluetoothAdapter: Bluetooth binder is null
02-21 22:32:59.452 2101-2215/? E/ActivityThread: Failed to find provider info for com.google.android.apps.gsa.testing.ui.audio.recorded
02-21 22:32:59.514 2180-2930/? E/BaseAppContext: Tried to stop global GMSCore RequestQueue. This is likely unintended, so ignoring.
02-21 22:32:59.619 2101-2112/? E/ReloadingLock: Finalizing LOCKED Token[canvas 2018-02-21 22:32:49.642]
02-21 22:32:59.619 2101-2112/? E/ReloadingLock: Finalizing LOCKED Token[searchresults_activity 2018-02-21 22:32:49.645]
02-21 22:32:59.619 2101-2112/? E/ReloadingLock: Finalizing LOCKED Token[shortcuts 2018-02-21 22:32:50.019]
02-21 22:32:59.619 2101-2112/? E/ReloadingLock: Finalizing LOCKED Token[shortcuts 2018-02-21 22:32:50.019]
02-21 22:32:59.733 2180-2884/? E/ConfigFileUtils: Failed to read config file: /data/user_de/0/com.google.android.gms/app_chimera/current_modulesets.pb (No such file or directory)
02-21 22:33:00.849 2180-2884/? E/ConfigFileUtils: Failed to read config file: /data/user_de/0/com.google.android.gms/app_chimera/current_modulesets.pb (No such file or directory)
02-21 22:33:01.003 2977-3074/? E/SQLiteLog: (1) no such table: mmsconfig
02-21 22:33:01.014 2977-3074/? E/Babel_SMS: canonicalizeMccMnc: invalid mccmnc nullnull
02-21 22:33:01.477 2444-2485/? E/Finsky: [120] com.google.android.finsky.ao.c.a(34): Unable to build selector: /storage/emulated/0/Download/marketenvs.csv (No such file or directory)
02-21 22:33:01.840 2000-2000/? E/BluetoothAdapter: Bluetooth binder is null
02-21 22:33:01.854 2180-3091/? E/MDM: [177] wut.run: Couldn't connect to Google API client: krs{statusCode=API_UNAVAILABLE, resolution=null, message=null}
02-21 22:33:01.967 2444-2444/? E/Finsky: [2] com.google.android.finsky.wear.ap.a(3): onConnectionFailed: ConnectionResult{statusCode=SERVICE_VERSION_UPDATE_REQUIRED, resolution=null, message=null}
02-21 22:33:02.816 2180-2726/? E/ActivityThread: Failed to find provider info for com.google.android.wearable.settings
02-21 22:33:04.274 2000-2400/? E/NetworkScheduler.SR: Unrecognised action provided: android.intent.action.PACKAGE_REMOVED
02-21 22:33:04.443 2444-2444/? E/Finsky: [2] com.google.android.finsky.wear.ap.a(3): onConnectionFailed: ConnectionResult{statusCode=SERVICE_VERSION_UPDATE_REQUIRED, resolution=null, message=null}
02-21 22:33:04.659 2101-2215/? E/ActivityThread: Failed to find provider info for com.google.android.apps.gsa.testing.ui.audio.recorded
02-21 22:33:04.807 2180-2665/? E/ProtoUtils: Invalid message size: 5441537 (buffer end is 1425)
02-21 22:33:05.611 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:33:05.663 2101-2101/? E/WorkerLoader: No worker found for workerId bisto.
02-21 22:33:05.940 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:33:06.011 2180-2726/? E/ActivityThread: Failed to find provider info for com.google.android.wearable.settings
02-21 22:33:06.073 2180-2726/? E/ProcessCheckinRequest: CheckinNowTaskTag : Checkin Succeeded: https://android.clients.google.com/checkin (request #1): 
02-21 22:33:06.141 2180-2725/? E/ActivityThread: Failed to find provider info for com.google.android.wearable.settings
02-21 22:33:07.248 2180-2725/? E/ProcessCheckinRequest: CheckinNowTaskTag : Checkin Succeeded: https://android.clients.google.com/checkin (request #1): 
02-21 22:33:07.212 2180-2725/? E/ActivityThread: Failed to find provider info for com.google.android.wearable.settings
02-21 22:33:07.380 1538-1629/? E/TaskPersister: File error accessing recents directory (directory doesn't exist?).
02-21 22:33:09.825 2101-2215/? E/ActivityThread: Failed to find provider info for com.google.android.apps.gsa.testing.ui.audio.recorded
02-21 22:33:13.406 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:33:14.912 2101-2215/? E/ActivityThread: Failed to find provider info for com.google.android.apps.gsa.testing.ui.audio.recorded
02-21 22:33:15.679 2101-2101/? E/SearchServiceStarter: Task 174 failed or timed out. Client 9241814964996985 disconnecting from SearchService!
                                                       java.util.concurrent.CancellationException: Task was cancelled.
                                                           at com.google.common.util.concurrent.d.da(SourceFile:80)
                                                           at com.google.common.util.concurrent.d.get(SourceFile:62)
                                                           at com.google.common.util.concurrent.cf.o(SourceFile:2)
                                                           at com.google.common.util.concurrent.ax.m(SourceFile:50)
                                                           at com.google.common.util.concurrent.az.run(SourceFile:5)
                                                           at com.google.android.apps.gsa.shared.util.concurrent.a.bf.run(SourceFile:2)
                                                           at android.os.Handler.handleCallback(Handler.java:790)
                                                           at android.os.Handler.dispatchMessage(Handler.java:99)
                                                           at android.os.Looper.loop(Looper.java:164)
                                                           at android.app.ActivityThread.main(ActivityThread.java:6494)
                                                           at java.lang.reflect.Method.invoke(Native Method)
                                                           at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
                                                           at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:807)
02-21 22:33:17.361 1538-1555/? E/BatteryExternalStatsWorker: modem info is invalid: ModemActivityInfo{ mTimestamp=0 mSleepTimeMs=0 mIdleTimeMs=0 mTxTimeMs[]=[0, 0, 0, 0, 0] mRxTimeMs=0 mEnergyUsed=0}
02-21 22:33:18.027 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:33:19.103 1538-1551/? E/memtrack: Couldn't load memtrack module
02-21 22:33:19.983 2101-2215/? E/ActivityThread: Failed to find provider info for com.google.android.apps.gsa.testing.ui.audio.recorded
02-21 22:33:25.063 2101-2215/? E/ActivityThread: Failed to find provider info for com.google.android.apps.gsa.testing.ui.audio.recorded
02-21 22:33:26.594 1538-1551/? E/memtrack: Couldn't load memtrack module
