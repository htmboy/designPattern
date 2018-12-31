package com.imooc.pattern.adapter;
/**
 * 二相转三相的适配器
 * @author aooled-laptop
 *
 */
public class TwoPlugAdapter implements ThreePlugIf {
	
	private GBTwoPlug plug;
	
	public TwoPlugAdapter(GBTwoPlug plug) {
		this.plug = plug;
	}

	@Override
	public void powerWithThree() {
		System.out.println("通过转换");
		plug.powerWithTwo();
		

	}

}
