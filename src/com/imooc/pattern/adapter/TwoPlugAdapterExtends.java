package com.imooc.pattern.adapter;
/**
 * ���ü̳з�ʽ�Ĳ���������
 * @author aooled-laptop
 *
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {

	@Override
	public void powerWithThree() { // ʵ����
		System.out.println("�����̳�ʽ������");
		this.powerWithTwo(); // �̳���
	}

}
