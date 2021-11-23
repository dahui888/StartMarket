# Android跳转各应用市场
[![](https://jitpack.io/v/dahui888/StartMarket.svg)](https://jitpack.io/#dahui888/StartMarket)
[![API](https://img.shields.io/badge/API-14%2B-orange.svg?style=flat)](https://android-arsenal.com/api?level=14)

### 1.添加方法

#### 1.1 添加仓库

在项目的 `build.gradle` 文件中配置仓库地址。

```android
repositories {
    maven { url 'https://jitpack.io' }
}
```

#### 1.2 添加项目依赖

在需要添加依赖的 Module 下添加以下信息，使用方式和普通的远程仓库一样。

```android
implementation 'com.github.dahui888:StartMarket:v1.0.0'
```
### 1.使用方法

只需一行代码就可以跳转各大应用市场

#### （1）不指定包名
参数1.上下文
```
MarketUtils.getTools().startMarket(this);
```

#### （2）指定包名 跳转你的App详情页
参数1.上下文 2.你想跳转的应用包名
```
MarketUtils.getTools().startMarket(this, "com.tencent.mm");
```


#### （3）启动到应用商店app详情界面 （指定包名与应用商店包名）
参数1.上下文 2.你想跳转的应用包名 3.本机的应用市场或者指定的应用市场名
```
MarketUtils.getTools().launchAppDetail(this,"com.tencent.mm","com.xiaomi.market");
```

