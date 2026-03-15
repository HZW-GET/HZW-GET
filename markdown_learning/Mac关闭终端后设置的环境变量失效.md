很多时候我们在设置环境变量的时候都是在bash_profile文件中导入，比如：

```shell
export PATH="/Users/mac/opt/anaconda3/bin:$PATH
```
然后执行source ~/.bash_profile使生效

但是当我们关闭终端后再重新打开时又需要重新执行source ~/.bash_profile才能生效

这是因为系统当前使用的shell不是bash

查看当前使用的shell
```shell
echo $SHELL
```
比如当前使用的是zsh，则输出
```
/bin/zsh
```
查看当前系统支持的shell
```shell
cat /etc/shells
```
## 解决方法
1. 切换shell
```shell
chsh -s /bin/bash
```
2. 直接在.zshrc文件中添加环境变量，打开.zshrc文件
```shell
open ~/.zshrc
```
3. 也可以在.zshrc中添加以下
```shell
source ~/.zshrc
```



