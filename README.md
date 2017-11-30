---

### ezvizsdk打包过程
#### 1.新建一个android项目
#### 2.新建一个library,命名为ezviz
#### 3.拷贝app目录下的libs和src文件到ezviz目录下，覆盖原有的libs和src文件
#### 4.修改libs文件中EZOpenSDK_V4.7.1.20171109.jar为EZOpenSDK.jar
#### 5.打开src/main/java/com/videogo,只保留RootActivity.java,ExitActivity.java文件和其他目录文件，删除多余的java文件。
#### 6.打开src/main/AndroidManifest.xml，注释掉<application></application>所有关的代码。
#### 7.打开ezviz/build.gradle，在dependencies中添加一下代码:
```js
dependencies {
    compile files('libs/EZOpenSDK.jar')
    compile files('libs/zxing.jar')
}
```
#### 8.编辑项目，Moudle 'ezviz'。
#### 9.点击androidstudio最右侧的gradle，双击ezviz/Tasks/build/assemblerelease进行打包。
#### 10.在项目中的build/outputs/aar找到ezviz-release.aar文件，修改名称为ezvizsdk.aar。

---
1、Android接入指南文档查看地址：http://open.ys7.com/doc/book/4.x/android-sdk.html
2、对应api查看地址：http://open.ys7.com/doc/android
