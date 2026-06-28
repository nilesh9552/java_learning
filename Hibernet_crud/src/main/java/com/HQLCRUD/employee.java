package com.HQLCRUD;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import sun.util.resources.Bundles.Strategy;

@Entity
public class employee {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id ;
String name;
String city;
int age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "employee [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + "]";
}







}
