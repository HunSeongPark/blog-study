package org.rec10;

// 같은 파일 내 위치할 경우 permits 생략 가능
public sealed class Animal {}

final class Cat extends Animal {} // 상속 불가능
non-sealed class Tiger extends Animal {} // 상속 가능. Animal에서 해당 클래스 상속받은 클래스 추적 불가
sealed class Dog extends Animal {} // 상속 가능.

final class Chihuahua extends Dog {} // Animal - Dog - Chihuahua 3계층 상속 구조

