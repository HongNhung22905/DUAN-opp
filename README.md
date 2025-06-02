**Dự Đoán Giá Nhà dựa trên các đặc trưng bất động sản bằng Mạng Nơ-Ron Đa Tầng (MLP)**

**Mục Tiêu :**
- Diện tích
- Số phòng ngủ
- Vị trí (thành phố, quận/huyện)
- Loại hình đất
- Số tầng
- Hướng nhà
- Pháp lý
- Nội thất
- Các yêu tố liên quan khác ....

**📌Phương pháp áp dụng :**
- **Mạng nơ-ron đa tầng(MLP)** - Tham khảo chương 10.3
- **Quy tắc học perceptron** - tham khảo chương 10.5
- Thư viện sử dụng : 'TensorFlow' hoặc 'PyTorch'

**📁 Tập Dữ Liệu**
Dữ liệu được **thu thập từ trang batdongsan.com.vn** và bao gồm các đặc trưng sau:
- Loại giao dịch : mua,bán,cho thuê,chuyển nhượng,...
- Thành phố : khu vực sở hữu bất động sản
- Quận/huyện : Quận/huyện cụ thể
- Loại hình đất : đất nền, nhà phố, căn hộ, hay đất thổ cư,...
- **Mức giá** : Giá giao dịch(triệu hoặc tỷ đồng) - *biến mục tiêu cần dự đoán*
- Diện tích : Diện tích sử dụng hoặc diện tích đất (m²)
- Số phòng ngủ : Số lượng phòng ngủ
- Số phòng tắm,vệ sinh: số lượng phòng tắm/toilet
- Số tầng : số tầng của căn nhà
- Hướng nhà : Hướng chính (Đông ,Tây, Nam, Bắc....)
- Hướng ban công : Hướng ban công(nếu có)
- Mặt tiền : Chiều rộng mặt tiền(mét)
- ĐƯờng vào : Độ rộng trước nhà (mét)
- Pháp lý : tình trạng pháp lý(sổ đỏ, sổ hồng, giấy tay....)
- Nội thất: trạng thái nội thất(đầy đủ, cơ bản, trống ...)

**Các Bước Thực Hiện**

1.**Thu thập dữ liệu** từ *batdongsan.com.vn* với các đặc trưng số (diện tích, số phòng, v.v.).

2.**Tiền xử lý dữ liệu** (chuẩn hóa, xử lý giá trị thiếu).

3.**Thiết kế mạng MLP**(số tầng, số nơ-ron, hàm kích hoạt như ReLU).

4.**Huấn luyện mô hình** bằng thư viện (TensorFlow, PyTorch) và đánh giá trên tập kiểm tra.

5.**Đánh giá và trực quan hóa kết quả**:
- Biểu đồ so sánh giá nhà thực tế và giá nhà dự đoán
- Tính toán các chỉ số : MSE ,RMSE ,MAE

**Kết Quả Mong Đợi :**
Một mô hình MLP dự đoán giá nhà với độ chính xác cao (ví dụ: MSE thấp), kèm biểu đồ so sánh giá thực tế và dự đoán, hiệu quả hơn các mô hình tuyến tính truyền thống.

**Thư Viện Sử Dụng:**

Python 3.x

NumPy

Pandas

Matplotli

BeautifulSoup4