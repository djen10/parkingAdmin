import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface Retrofit2 {

    @POST("api/test")
    Call<Object> apiTest(@Header("content-type") String contentType, @Body String params);

}
