# EnhanceMarqueeView

俗名：增强版  |  垂直跑马灯  
学名：增强版  |  垂直翻页公告

### 效果图

<img src="/screenshot/MarqueeView_Gif.gif" style="width: 30%;">

### 使用

#### Gradle:

    compile 'com.sunfusheng:marqueeview:1.0.0'

#### 属性

| Attribute 属性          | Description 描述 |
|:---				     |:---|
| mvAnimDuration         | 一行文字动画执行时间           |
| mvInterval         | 两行文字翻页时间间隔           |
| mvTextSize         | 文字大小           |
| mvTextColor         | 文字颜色          |

#### XML
```
    <com.sunfusheng.marqueeview.MarqueeView
        android:id="@+id/marqueeView"
        android:layout_width="match_parent"
        android:layout_height="30dp"
        app:mvAnimDuration="1000"
        app:mvInterval="3000"
        app:mvTextColor="@color/white"
        app:mvTextSize="14sp"/>
 ```

#### 设置列表数据
```
    MarqueeView marqueeView = (MarqueeView) findViewById(R.id.marqueeView);
        HashMap<String,View.OnClickListener> noticeListenerMap =new LinkedHashMap<>();
        noticeListenerMap.put("lixiaodaoaaa001 is a goodboy", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "you click first", Toast.LENGTH_SHORT).show();
            }
        });
        noticeListenerMap.put("lixiaodaoaaa002", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "you click 002", Toast.LENGTH_SHORT).show();
            }
        });
        noticeListenerMap.put("lixiaodaoaaa003", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "you click 003", Toast.LENGTH_SHORT).show();
            }
        });
        noticeListenerMap.put("lixiaodaoaaa004", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "you click 004", Toast.LENGTH_SHORT).show();
            }
        });
```
#### 设置字符串数据

    String notice = "心中有阳光，脚底有力量！心中有阳光，脚底有力量！心中有阳光，脚底有力量！";
    marqueeView.startWithText(notice);



### 关于我

感觉此篇文章对你有用，可以打赏博主少许银两 支持博主努力创作！ 
![](http://img.blog.csdn.net/20160607170944494)
License
--
    Copyright (C) 2016 sfsheng0322@gmail.com

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
