Java OOP Challenge: Employees & Company Management

A foundational Java application designed to explore the core principles of Object-Oriented Programming (OOP) — specifically Encapsulation, Data Types, Array Operations, and Enum Architectures.

[Switch to Turkish Version (#türkçe-dokümantasyon) 🇹🇷]

🇬🇧 English Documentation

This repository contains structural solutions for a corporate and insurance management simulation, focusing on safe data access, array boundary checking, and custom object formatting.

🚀 Features & Objectives

1. Insurance Plan Strategy (Healthplan & Plan)
   Objective: Define corporate health coverage options using strict type safety.
   Enum Architecture: Built inside a dedicated enums package. Each plan maps directly to custom attributes like name and price (e.g., BASIC).
   Encapsulation: All fields remain hidden via private fields, exposed strictly through validated getters and setters.
2. Workforce Entity Management (Employee)
   Objective: Model an individual employee containing secure identification fields and an array of linked health coverage plans.
   Boundary Validation: The addHealthplan(int index, String name) method dynamically validates index limits before performing operations:
   Fills empty cells safely if the slot is clear.
   Prints localized warnings if a collision occurs (slot already occupied).
   Gracefully traps and prevents ArrayIndexOutOfBoundsException events if the index is invalid.
3. Enterprise Operations Tracker (Company)
   Objective: Handle core business details (id, name, giro, and a list of active developerNames).
   Financial Guardrails: Employs defensive setter/constructor logic ensuring that the giro property can never fall below zero (0).
   Staff Allocation: The addEmployee(int index, String name) method implements full collision and index-out-of-bounds safety checks when inserting names into the engineering array.

   🛠️ Tech Stack

   Language: Java 11 / 17+
   Core Concepts: Encapsulation, Enum Custom Constructors, Array Index Boundary Handling, @Override toString()
   IDE: IntelliJ IDEA

   🇹🇷 Türkçe Dokümantasyon

   Bu proje; Java dil temellerini, Nesne Yönelimli Programlama (OOP) ilkelerini — özellikle Kapsülleme (Encapsulation), Enum Yapıları ve Dizi Sınır Kontrollerini — pekiştirmek amacıyla geliştirilmiş kurumsal bir simülasyondur.

   🚀 Özellikler ve Hedefler

1. Sağlık Sigortası Altyapısı (Healthplan & Plan)
   Hedef: Şirket çalışanlarına sunulacak sigorta paketlerini tip güvenli bir mimariyle kurmak.
   Enum Tasarımı: enums paketi altında yapılandırılan Plan enum'ı; her pakete özel name ve price alanlarını saklar. BASIC planı zorunlu olarak mevcuttur.
   Veri Güvenliği: Sınıf değişkenleri private tutularak getter/setter encapsulation kurallarına tam uyum sağlanmıştır.
2. Çalışan Yönetim Sistemi (Employee)
   Hedef: Benzersiz kimlik, iletişim bilgileri ve sahip olunan sigorta planlarını (String[] healthplans) tek bir modelde birleştirmek.
   Güvenli Dizi Ekleme: addHealthplan(int index, String name) metodu ile dizi işlemleri tam kontrol altına alınmıştır:
   Belirtilen indeks boşsa veri başarıyla yazılır.
   İndeks doluysa üzerine yazılması engellenir ve kullanıcıya uyarı basılır.
   Dizi sınırlarının dışındaki bir indeks girildiğinde hata fırlatılması engellenerek kontrollü mesaj üretilir.
3. Şirket Finans ve Kadro Yönetimi (Company)
   Hedef: Şirket verilerini (id, name, giro) ve kadrodaki yazılımcıları (String[] developerNames) yönetmek.
   Finansal Kalkan: Şirket ciro (giro) değerinin hiçbir senaryoda 0'ın altına düşmemesini garanti eden korumalı constructor/setter mantığı içerir.
   Kadro Atama: addEmployee(int index, String name) metodu, yazılımcı dizisine ekleme yaparken indeks taşması (out of bounds) ve veri çakışması (collision) kontrollerini eksiksiz yürütür.
   
🛠️ Kullanılan Teknolojiler

   Dil: Java 11 / 17+
   Temel Kavramlar: Kapsülleme (Encapsulation), Özelleştirilmiş Enumlar, Dizi Sınır Güvenliği, toString() Metot Ezilmesi
   IDE: IntelliJ IDEA

   📥 Driver & Console Execution / Test ve Çalıştırma

   Gereksinimler doğrultusunda tüm test işlemleri Main metodundan çağrılan izole bir metot üzerinden yürütülür:
   public class Main {
   public static void main(String[] args) {
   runApplication();
   }

    private static void runApplication() {
        // Obje oluşturma ve toString() fiş dökümleri burada simüle edilir.
        Healthplan basicPlan = new Healthplan(1, "All-Inclusive", Plan.BASIC);
        System.out.println(basicPlan);
    }
}