package com.igorpf.imagej.plugins;

import ij.*;
import ij.plugin.filter.PlugInFilter;
import ij.process.ImageProcessor;

public class Inverter_ implements PlugInFilter {

    private ImagePlus imagePlus;

    @Override
    public int setup(String s, ImagePlus imagePlus) {
        this.imagePlus = imagePlus;
        return DOES_ALL;
    }

    @Override
    public void run(ImageProcessor imageProcessor) {
        imageProcessor.invert();
    }
}
