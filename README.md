## View-ViewGroup
# Layout
  - Layout định nghĩa giao giện người dùng
  - Mỗi layout sẽ có 1 lớp bên trong gọi là LayoutParams. LayoutParams này định nghĩa các phần tử XML nói chung mà layout đó sử dụng thường đặt tên android:layout_(...) : thường dùng để thay đổi về kích thước phần nhìn của một View với cái View bao nó. Còn một loại phần tử XML khác được đặt tên là android:layout(...) thường dùng để thiết kế phần nhìn các nội dung bên trong view đó.
# Commonly Used Attributes
  - size : chiều cao và chiều rộng của view có các kiểu giá trị match_parent(dựa theo giá trị của View bao nó), wrap_content(phù hợp với nội dung bên trong), các giá trị số cụ thể
  - vị trị : trên, dưới, trái, phải,.... android:layout_gravity(vị trí của view với view bao nó), android:gravity(vị trí các text, thành phần bên trong View đó). Các giá trị có thể thêm vào top, bottom, left, right, center,.....
  - margib(khoảng cách bên ngoài tính từ border), padding(khoảng các bên trong tính từ border). Có một số thuộc tính con top, bottom, left, right vd: android:layout_marginBottom.
  - id: trong trường hợp cần thao tác với view thì cần dùng đến
  - background: thay đổi nền của View (có thể là màu, ảnh hoặc 1 drawable file)
# LinearLayout
  - Linear Layout: các View trong linearlayout có tính tuyến tính tức là cứ hết 1 view thì sẽ đến view tiếp theo không đè lên nhau. Các view được sắp xếp theo 2 chiều là vertical(thẳng) và horizontal (bề ngang).
  - một số thuộc tính quan trọng: android:orientation (hướng sắp xếp của các View bên trong); android:gravity (vị trí các View bên trong trên dưới trái hay phải của View bao chúng); android: weightSum( tổng khối lượng các View con kích thước các View con, kích thước các con sẽ được tính theo tỷ lệ)
# RelativeLayout
  - các View con sẽ được sắp xếp dựa theo vị trí của nhau và View bao chúng
  - dựa theo View bao chúng vd: android:layout_alignParentStart( End, Top, Bottom,...) hoặc android:layout_centerInParent(centerHorizontal, centerVertical) với giá trị được gắn là true hoặc false
  - dựa theo View cùng cấp vd: android:layout_alignParentStart( End, Top, Bottom,...) hoặc android:layout_centerInParent(centerHorizontal, centerVertical) với giá trị được gắn là id của View làm mốc
# Basic control
  - textView: dùng để hiển thị văn bản có các attribute như id, text, textColor,....
  - EditText: là một lớp con của TextView có khả năng thay đổi có các attribute như của TextView và thêm 1 số cái khác như inputType, singleLine, hint, textColorHint,....
  - Button: một nút có thể có tương tác với người dùng có attribute như id,text, ..., onClick, clickable. nội dung của 1 button có thể là text, icon, hoặc cả 2
  - ImageView dùng để hiển thị hình ảnh có các attribute src, scaleType, adjustViewBounds
  - Radio Group & Radio Button: radiobutton có 2 trạng thái là click hoặc không kích, radiogroup là tập hợp các radiobutton
  - ToggleButton: cho phép người dùng chuyển đổi giữa 2 trạng thái. Có attribute textOn hoặc textOff
  - CheckBox, Spinner, WebView
