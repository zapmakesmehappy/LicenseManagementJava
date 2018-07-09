package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.ReturnData;

public class ManagementDao {
	public static void registerDao(String key1,String key2,String key3){
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			// ②JDBCドライバをロードする
			Class.forName("com.mysql.jdbc.Driver");

			// ③DBMSとの接続を確立する
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/licensedb?useSSL=false",
					"licenseuser",
					"pass");
			// ④SQL文を作成する
			String sql = "insert into student(name,year,class) values(?,?,?);";
			// ⑤SQL文を実行するための準備を行う
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, key1);
			pstmt.setString(2, key2);
			pstmt.setString(3, key3);

			// ⑥SQL文を実行してDBMSから結果を受信する
			pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが見つかりません。");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			e.printStackTrace();
		} finally {
			// ⑧DBMSから切断する
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
		}
	}
	public static void registerlicenseDao(int key1,int key2,int key3,String key4){
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			// ②JDBCドライバをロードする
			Class.forName("com.mysql.jdbc.Driver");

			// ③DBMSとの接続を確立する
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/licensedb?useSSL=false",
					"licenseuser",
					"pass");
			// ④SQL文を作成する
			String sql = "insert into management(id,lid,date,sof) values(?,?,?,?);";
			// ⑤SQL文を実行するための準備を行う
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key1);
			pstmt.setInt(2, key2);
			pstmt.setInt(3, key3);
			pstmt.setString(4, key4);

			// ⑥SQL文を実行してDBMSから結果を受信する
			pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが見つかりません。");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			e.printStackTrace();
		} finally {
			// ⑧DBMSから切断する
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
		}
	}
	public static int searchIdDao(String key1){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;

		try {
			// ②JDBCドライバをロードする
			Class.forName("com.mysql.jdbc.Driver");

			// ③DBMSとの接続を確立する
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/licensedb?useSSL=false",
					"licenseuser",
					"pass");
			// ④SQL文を作成する
			String sql = "SELECT id FROM student WHERE name = ?;";
			// ⑤SQL文を実行するための準備を行う
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, key1);

			// ⑥SQL文を実行してDBMSから結果を受信する
			rs = pstmt.executeQuery();

			// ⑦実行結果を含んだインスタンスからデータを取り出す
			rs.next();
			int id = rs.getInt("id");
			result = id;

		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが見つかりません。");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			e.printStackTrace();
		} finally {
			// ⑧DBMSから切断する
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
		}
		return result;
	}
	public static int searchLidDao(String key1){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;

		try {
			// ②JDBCドライバをロードする
			Class.forName("com.mysql.jdbc.Driver");

			// ③DBMSとの接続を確立する
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/licensedb?useSSL=false",
					"licenseuser",
					"pass");
			// ④SQL文を作成する
			String sql = "SELECT lid FROM license WHERE lname = ?;";
			// ⑤SQL文を実行するための準備を行う
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, key1);

			// ⑥SQL文を実行してDBMSから結果を受信する
			rs = pstmt.executeQuery();

			// ⑦実行結果を含んだインスタンスからデータを取り出す
			rs.next();
			int lid = rs.getInt("lid");
			result = lid;

		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが見つかりません。");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			e.printStackTrace();
		} finally {
			// ⑧DBMSから切断する
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
		}
		return result;
	}
	public static ArrayList<ReturnData> getAllData(){
		ArrayList<ReturnData> resultList = new ArrayList<ReturnData>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// ②JDBCドライバをロードする
			Class.forName("com.mysql.jdbc.Driver");

			// ③DBMSとの接続を確立する
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/licensedb?useSSL=false",
					"licenseuser",
					"pass");
			// ④SQL文を作成する
			String sql = "select student.name,license.lname,management.date,management.sof from student,license,management where management.id = student.id and management.lid = license.lid;";
			// ⑤SQL文を実行するための準備を行う
			pstmt = con.prepareStatement(sql);
			// ⑥SQL文を実行してDBMSから結果を受信する
			rs = pstmt.executeQuery();
			// ⑦実行結果を含んだインスタンスからデータを取り出す
			while(rs.next()==true){
				String name = rs.getString("name");
				String lname = rs.getString("lname");
				int date = rs.getInt("date");
				String sof = rs.getString("sof");
				resultList.add(new ReturnData(name,lname,date,sof));
			}

		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが見つかりません。");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			e.printStackTrace();
		} finally {
			// ⑧DBMSから切断する
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
		}
		return resultList;
	}
}
