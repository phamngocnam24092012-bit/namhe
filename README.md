# Auto Sand (addon cho Meteor Client 26.2)

Module **Auto Sand** nằm trong tab "Auto Sand" của menu Meteor (RShift). Bấm nút bật là:

- tự đào khối cát gần nhất trong tầm đào,
- tự đổi sang đồ đào cát nhanh nhất trong hotbar (xẻng),
- tự đào khi ở gần cát, hết cát thì đổi lại slot cũ.

Cài đặt: range, auto-switch, swap-back, red-sand, skip-under-feet, delay.

## Build ra file .jar bằng điện thoại (GitHub Actions)

1. Tạo repo mới trên github.com (trình duyệt điện thoại, chọn "Desktop site" nếu cần).
2. Giải nén file zip, upload toàn bộ file/thư mục lên repo (Add file → Upload files). Nhớ upload cả thư mục `.github`.
3. Vào tab **Actions** → workflow **Build** → chờ chạy xong (vài phút).
4. Mở lần chạy đó, kéo xuống **Artifacts**, tải `auto-sand-jar`, giải nén lấy file `auto-sand-1.0.0.jar` (không lấy file `-sources`).
5. Bỏ .jar vào thư mục `mods` cùng với Meteor Client 26.2.

## Build trên máy tính

Cần JDK 25 và Gradle 9.6.1: chạy `gradle build`, file jar nằm ở `build/libs/`.

## Nếu build báo lỗi

Gửi nguyên đoạn lỗi cho Claude để sửa. Phiên bản nằm ở `gradle/libs.versions.toml`.
