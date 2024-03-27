package com.jyx.pdf.water;

/**
 * @ClassName: Test
 * @Description:
 * @Author: jyx
 * @Date: 2024-03-27 09:57
 **/
public class Test {

    public static void main(String[] args) {
        String sourcePath = "E:\\pdf\\nine.pdf";
        String targetPath = "E:\\pdf\\nine_marked.pdf";
        String WaterMarkContent = "受命于天 既寿永昌";
        int numberOfPage = 3;
        try {
            WaterMarker.addWaterMark(sourcePath, targetPath, WaterMarkContent, numberOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
