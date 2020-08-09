Có 3 file output cho 1 file input trong 1 folder : ví dụ file input là  X.txt thì output tương ứng là oX.txt, sol.txt, summary.txt. Hai file cuối là dùng chung cho mọi file X trong cùng folder. Mỗi lần chạy cả bộ dữ liệu thì tạo 1 folder lưu output riêng (ví dụ folder F).


Ví dụ file input là p2.2.a.txt trong folder Set_21_234 thì các file output là op2.2.a.txt, solutions.txt và summary.txt   

trong đó sol.txt ghi lời giải tốt nhất cho tìm thấy cho từng input; summary.txt ghi kết quả tóm tắt

Cấu trúc của summary.txt như sau: mỗi dòng là 1 bộ  
X Y Z T P ...
X: tên folder chứa output - giống nhau cho mọi file trong cùng 1 folder
Y: tên file input tương ứng - ví dụ p2.2.a.txt
Z: n  (số customers)
T: m (số tours)
P: giá trị của best found solution
Q: running time
…
có thể bổ sung thêm cách thông tin khác nếu cần. Mỗi field cách nhau 1 tab.

Cấu trúc của solutions.txt như sau: gồm m+1 dòng cho mỗi file input trong cùng 1 folder

X Y Z T P  
X: tên folder chứa output - giống nhau cho mọi file trong cùng 1 folder
Y: tên file input tương ứng - ví dụ p2.2.a.txt
Z: n  (số customers)
T: m (số tours)
P: giá trị của best found solution

và tiếp sau đó là m dòng, mỗi dòng ghi 1 tour trong lời giải tốt nhất tìm thấy.
