//教程地址https://www.runoob.com/design-pattern/factory-pattern.html
//工厂模式提供了创建对象的方式，使得创建对象的方式与使用对象的过程分离。
//工厂模式无需指定要创建的具体类，使用接口承接实现类即可
//将对象的创建逻辑封装在一个工厂类中，而不是直接实例化对象
public class JavaFactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();
    }
}
