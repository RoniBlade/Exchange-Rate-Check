//import org.junit.jupiter.api.Test;
//import org.larbcorp.ExchangeRatesApiService.ExchangeRatesServiceImpl.ExchangeRatesServiceImpl;
//import org.larbcorp.GifsApiService.GifApiServiceImpl.GifApiServiceImpl;
//import org.larbcorp.services.impl.MainServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//@SpringBootTest(classes = {ExchangeRatesServiceImpl.class, GifApiServiceImpl.class, MainServiceImpl.class})
//public class TestService {
//
//    @MockBean
//    private ExchangeRatesServiceImpl exchangeRatesService;
//
//    @MockBean
//    private GifApiServiceImpl gifApiService;
//
//    @Autowired
//    private MainServiceImpl mainService;
//
//    @Test
//    void testBusinessLogic() {
//        // Заглушка databaseService
//        when(exchangeRatesService.CurComparison("EUR")).thenReturn("rich");
//        when(gifApiService.getGifUrl("rich")).thenReturn("http://example.com/rich.gif");
//
//
//        // Тестируем функциональность MyService
//        String result = mainService.getTestData("EUR");
//
//        // Проверяем, что MyService правильно взаимодействовал с заглушкой databaseService
//        assertEquals("rich", result);
//    }
//}
