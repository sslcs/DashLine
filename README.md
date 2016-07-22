# Android Dash Line 安卓虚线

### 绘制原因 about
由于硬件加速的问题，安卓上原有的虚线方法不太好使了，为了兼容方便，还是绘制虚线比较简单。

### 接口说明 api

#### 设置高度 set height
setHeight(int height);
单位（unit） ： dp

#### 设置颜色 set color
setColor(int color);

#### 设置虚线间隔 set dash offset
setOffset(int offset);
单位（unit） ： dp

#### 设置虚线宽度 set dash width
setDashWidth(int width);
单位（unit） ： dp
