# 第一节

## markdown（准）实时预览（sublime）

也看了一些教程，推荐的方法有：
- MarkdownLivePreview  
  预览效果并不理想,很丑,而且不能横向滚动
-  MarkdownPreview  
  功能不是很强大，凑合用
-  MarkdownPreview + LiveReload  
   问题：LiveReload在sublime Text3支持不好

### MarkdownPreview 凑合使用手册
1. 安装
2. 使用
> crtl +shift + p  

![步骤1](./pic/markdownPreviewPic1.png)  
![步骤2](./pic/markdownPreviewPic2.png)



3. 加速（设置快捷键）  
![<用户快捷键设置>位置](./pic/markdownPreviewPic3.png)  
  ```
  {
    "keys": ["alt+m"], 
    "command": "markdown_preview",
    "args": 
        {
            "target": "browser",
              "parser":"markdown"
          }  
  }
  ```

**注意：**快捷键中有一对中括号`[]`,不要删除，否则不起作用