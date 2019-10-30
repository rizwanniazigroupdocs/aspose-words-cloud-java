package com.aspose.words.cloud;
import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.api.WordsApi;
import com.aspose.words.cloud.model.FilesUploadResult;
import com.aspose.words.cloud.model.requests.UploadFileRequest;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Map;

public final class TestInitializer {
    public static WordsApi wordsApi;
    public static String LocalTestFolder = "TestData";
    public static String LocalCommonFolder = Paths.get(LocalTestFolder, "Common").toString();
    public static String RemoteTestFolder = Paths.get("Temp", "SdkTests", "java").toString();
    public static String RemoteTestOut = Paths.get(RemoteTestFolder, "TestOut").toString();


    public static void Initialize() throws FileNotFoundException, ApiException {
        System.out.println(System.getProperty("user.dir") + "<<<======");
        Map<String, String> creds = new Gson().fromJson(new JsonReader(new FileReader("Settings/servercreds.json")), Map.class);
        if (creds == null) {
            throw new FileNotFoundException("Please put your credentials into Settings/servercreds.json file");
        }

        wordsApi = new WordsApi(new ApiClient());
        ApiClient client = wordsApi.getApiClient();
        client.setDebugging(false).setBaseUrl(creds.get("BaseUrl")).setAppKey(creds.get("AppKey")).setAppSid(creds.get("AppSid"));
    }

    public static FilesUploadResult UploadFile(String file, String path) throws FileNotFoundException, ApiException {
        UploadFileRequest request = new UploadFileRequest(new File(file), path, null);
        return wordsApi.uploadFile(request);
    }
}
