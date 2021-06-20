package Tompeixun;

public class Test1 {//List 接口是有序号的可重复的链型数据，可以按照索引来确定集合元素，
    //Test2 HashSet去除重复元素，一般都是会先比较两个元素的HashCode（）是否相同，如果不同然后在比较2个数据的值是不是一致，用equals（）
    //如果不一致会储存该元素
    //Test3 stack 先进后出，栈；queue 先进先出，队列；Array 有索引，有序，可以快速查找元素，但是增删慢，每次增删都要新建数组，然后先存新增元素，将其他元素填入
    //删除也是，先复制元素到新数组，但是删除元素不添加入新数组。
    //linked list，多个节点，通过地址链接。增删快，只需要修改前后元素地址就可。查找慢，需要通过某个节点向后查找
    //Test 4 Comparable：强行对实现它的类进行整体排序，只能用自然的方法排序，不能修改。可以直接使用Collections.sort（ArrayList）
    //Comparator 强行对某个对象整体排序。可以修改sort方法。

}
