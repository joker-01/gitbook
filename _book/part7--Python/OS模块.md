---
title: OS模块
date: 2020-09-28 22:57:50
tags:
---

## OS 模块
#### 代码
```
r"""OS routines for NT or Posix depending on what system we're on.

This exports:
  - all functions from posix or nt, e.g. unlink, stat, etc.
  - os.path is either posixpath or ntpath
  - os.name is either 'posix' or 'nt'
  - os.curdir is a string representing the current directory (always '.')
  - os.pardir is a string representing the parent directory (always '..')
  - os.sep is the (or a most common) pathname separator ('/' or '\\')
  - os.extsep is the extension separator (always '.')
  - os.altsep is the alternate pathname separator (None or '/')
  - os.pathsep is the component separator used in $PATH etc
  - os.linesep is the line separator in text files ('\r' or '\n' or '\r\n')
  - os.defpath is the default search path for executables
  - os.devnull is the file path of the null device ('/dev/null', etc.)

Programs that import and use 'os' stand a better chance of being
portable between different platforms.  Of course, they must then
only use functions that are defined by all platforms (e.g., unlink
and opendir), and leave all pathname manipulation to os.path
(e.g., split and join).
"""
```
翻译
```
NT或Posix的r“” OS例程，取决于我们所使用的系统。

这将导出：
  -posix或nt的所有功能，例如取消链接，统计信息等
  -os.path是posixpath或ntpath
  -os.name是'posix'或'nt'
  -os.curdir是代表当前目录的字符串（始终为“。”）
  -os.pardir是代表父目录的字符串（始终为“ ..”）
  -os.sep是（或最常见的）路径名分隔符（“ /”或“ \\”）
  -os.extsep是扩展分隔符（始终为“。”）
  -os.altsep是备用路径名分隔符（无或'/'）
  -os.pathsep是$ PATH等中使用的组件分隔符
  -os.linesep是文本文件中的行分隔符（“ \ r”或“ \ n”或“ \ r \ n”）
  -os.defpath是可执行文件的默认搜索路径
  -os.devnull是空设备的文件路径（'/ dev / null'等）

导入和使用“ os”的程序更有可能成为
在不同平台之间可移植。当然，他们必须
仅使用所有平台定义的功能（例如，取消链接
和opendir），并将所有路径名操作留给os.path
（例如，拆分和合并）。
“”
```

NT 是windows操作系统的内核，posix是unix、linux的内核规范，待学习了《操作系统原理》再来补充

买房考虑市政供暖

PSF （Python Software Foundation）
