package base;

/**
 * 一个字节占8位
 * 基本数据类型 byte[1字节] short[2字节] int[4字节] long[8字节] float[4字节] double[8字节] char[1字节] boolean[1字节]
 * 类型转换（自动转换\强制转换）
 * String转基本类型: 包装类{(int、Integer),(double、Double),(float、Float),(byte、Byte),(boolean、Boolean),(short、Short)}
 */
public class DataType {
    public static void main(String[] args) {

        /**
         * byte基本单位 bit最小单位  1 byte 占 8 bit
         * utf-8 字母1个字节 汉字3个字节（可变编码）
         * GBK 字母1个字节 汉字2个字节
         * Unicode 字母与汉字都占2个字节
         */
        /**
         *
         *整型
         *类型  占用空间  范围
         *byte  1字节   -2^8 ~ 2^8-1
         *short 2字节   -2^15 ~ 2^15-1
         *int   4字节   -2^31 ~ 2^31-1
         *long  8字节   -2^63 ~ 2^63-1
         */
         int i=1;
         byte b=1;
         short s=1;
         long l=1L;
        /**
         *浮点数=符号位+指数位+尾数位
         *类型  占用空间  范围
         *float  4字节  -3.403E38 ~ 3.403E38
         *double 8字节  -1.798E308 ~1.798E308
         */
        float f=3.1f;
        double d=5.12;
        //注意浮点数计算后判断
        double d1=2.7;
        double d2=8.1/3;
        System.out.println("浮点数数值1"+d1);
        System.out.println("浮点数数值2"+d2);


        /**
         * 字符类型
         *类型  占用空间
         *char  1字节
         * 若为整数时对应ascii码表
         */
        char c='单';
        char c1=97;
        System.out.println(c1);

        /**
         * 布尔类型
         *类型  占用空间
         *boolean  1字节  true/false
         * 逻辑运算
         */
        boolean B=true;
        if(B){
            System.out.println("布尔类型");
        }

        /**
         * 类型转换
         * 自动转换 (小——>大转换)
         * char ——> int ——> long ——> float ——> double
         * byte ——> short ——> int  ——> long  ——> float ——> double
         * 强制类型转换(大——>小转换)
         * byte、short、char不能自动转换，它们相互有计算时自动升级为int计算
         *
         */
         int a1=1;
         short s1=34;
         byte b1=67;
         double D=10.78+a1+s1+b1;
         System.out.println("自动类型转换"+D);
         int a2=(int)D;
         System.out.println("强制类型转换"+a2);

        /**
         * String 与基本数据类型转换
         */
        //基本转String
         int a4=100;
         double d4=99.8978;
         String s4=a4+""+d4;
         System.out.println("基本转String"+s4);

         //String转基本 (包装类) 转化时需保证字符串符合对应数据类型
        String s5="678";
        int i5=Integer.parseInt(s5);
        char c5=s5.charAt(1);
        System.out.println("String转基本"+i5);
        System.out.println("byte获取对应位置字符"+c5);





    }

}
