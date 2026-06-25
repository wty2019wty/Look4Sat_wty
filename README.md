# Look4Sat: Satellite tracker
[![Hits](https://hits.sh/github.com/wty2019wty/Look4Sat_wty.svg?style=plastic)](https://hits.sh/github.com/wty2019wty/Look4Sat_wty/)


# [cf 反代加速worker.js](/wty_add_whitelist_worker.js)
### 将卫星数据更新添加了代理，方便访问

### 修改了包名com.rtbishop_wty.look4sat

```
helps for wty(PowerShell)
1. 设置 JAVA_HOME（根目录，不要带 bin）
$env:JAVA_HOME = "D:\Java\jdk-17"

2. 将 JDK 17 的 bin 目录放到 PATH 最前面
$env:PATH = "$env:JAVA_HOME\bin;$env:PATH"

验证切换是否成功（输出应为 Java 17 版本）
java -version

./gradlew assembleRelease

```
The application is built using Kotlin, Coroutines, Jetpack Compose and Navigation.\
It is now and always will be completely ad-free and open-source.

## Main features:

*  Predicting satellite positions and passes for up to 10 days
*  Showing the list of currently active and upcoming satellite passes
*  Showing the active pass progress, polar trajectory and transceivers info
*  Showing the satellite positional data, footprint and ground track on the map
*  Custom TLE satellite data import is available via Three Line Element .txt files
*  Offline first: calculations are made offline. Weekly TLE data update is recommended.

## Star History

<a href="https://www.star-history.com/?repos=rt-bishop%2FLook4Sat&type=timeline&legend=top-left">
 <picture>
   <source media="(prefers-color-scheme: dark)" srcset="https://api.star-history.com/chart?repos=rt-bishop/Look4Sat&type=timeline&theme=dark&legend=top-left" />
   <source media="(prefers-color-scheme: light)" srcset="https://api.star-history.com/chart?repos=rt-bishop/Look4Sat&type=timeline&legend=top-left" />
   <img alt="Star History Chart" src="https://api.star-history.com/chart?repos=rt-bishop/Look4Sat&type=timeline&legend=top-left" />
 </picture>
</a>
