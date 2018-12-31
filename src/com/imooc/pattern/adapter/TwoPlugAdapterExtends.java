package com.imooc.pattern.adapter;
/**
 * 采用继承方式的插座适配器
 * @author aooled-laptop
 *
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {

	@Override
	public void powerWithThree() { // 实现了
		System.out.println("借助继承式适配器");
		this.powerWithTwo(); // 继承了
	}

}
