# Rescue Robot Project

## 1. Java สืบทอดหลาย class ไม่ได้เพราะอะไร?
Java ไม่รองรับการสืบทอดคลาสหลายคลาสเนื่องจากอาจทำให้เกิดความกำกวมและความซับซ้อน โดยเฉพาะปัญหาไดมอนด์ ซึ่งทำให้โปรแกรมดูแลรักษาและเข้าใจได้ยาก
## 2. เราใช้ interfaces + composition แทนอย่างไร?
ใช้อินเทอร์เฟซเพื่อให้คลาสสามารถใช้ได้หลายอย่าง การประกอบช่วยในการรวมส่วนประกอบต่างๆ เช่น แบตเตอรี่ GPS และกล้องถ่ายภาพความร้อน ทำให้ระบบมีความยืดหยุ่นและเป็นโมดูลมากขึ้น
## 3. อธิบายการแก้ปัญหา default method ชื่อชนกัน
เราต้อง override method นั้นเอง เพื่อบอกชัดเจนว่าจะใช้ของใคร หรือจะเขียนใหม่เอง

## Scenario Test
The program simulates a rescue robot performing:
- Update GPS position
- Flying and driving
- Detecting temperature and human
- Sending messages with location

## Output
<img width="703" height="593" alt="image" src="https://github.com/user-attachments/assets/c4d27aaf-eae3-4984-866f-43ceab46d4ef" />
<img width="370" height="281" alt="image" src="https://github.com/user-attachments/assets/30065e34-0117-495c-a5dd-214abdde2830" />
<img width="675" height="303" alt="image" src="https://github.com/user-attachments/assets/8b425a58-421a-4eaf-b3db-acae14c64e6c" />
<img width="715" height="344" alt="image" src="https://github.com/user-attachments/assets/dec91f6f-ed81-4bcc-b424-8928d74bd6f5" />

