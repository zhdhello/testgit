package com.liuyi_02;

import com.liuyi_01.Jump;

/**
 * ���Ǿ���Ĺ���
 * 
 * @author ������
 * @version V1.0
 */
public class Dog extends Animal implements Jump {

	@Override
	public void jump() {
		System.out.println("�����ߵĹ�");
	}

	@Override
	public void eat() {
		System.out.println("������");
	}

	@Override
	public void sleep() {
		System.out.println("��վ��˯��");
	}

}
