1、Android接入指南文档查看地址：http://open.ys7.com/doc/book/4.x/android-sdk.html
2、对应api查看地址：http://open.ys7.com/doc/android
---

### ezvizsdk打包过程
#### 1.新建一个android项目
#### 2.新建一个library,命名为ezviz
#### 3.拷贝app目录下的libs和src文件到ezviz目录下，覆盖原有的libs和src文件
#### 4.修改libs文件中EZOpenSDK_V4.7.1.20171109.jar为EZOpenSDK.jar
#### 5.打开src/main/AndroidManifest.xml，注释掉<application></application>所有关的代码。
#### 6.打开ezviz/build，注释掉<application></application>所有关的代码。
