import java.util.HashMap;
import java.util.Map;

public class Responder {
    private Map<String, String> knowledgeBase;

    public Responder() {
        knowledgeBase = new HashMap<>();
        fillKnowledgeBase();
    }

    private void fillKnowledgeBase() {
        // Mapping Keyword Masalah -> Solusi Teknis
        knowledgeBase.put("crash", "Solusi: Cek log error di /var/log/syslog. Kemungkinan Memory Leak.");
        knowledgeBase.put("slow", "Solusi: Cek penggunaan CPU. Jalankan index maintenance pada Database.");
        knowledgeBase.put("wifi", "Solusi: Reset adapter network atau cek konfigurasi IP DHCP.");
        knowledgeBase.put("password", "Solusi: Kirim link reset password via email admin console.");
        knowledgeBase.put("blue screen", "Solusi: Cek driver hardware terbaru atau rollback update OS terakhir.");
        knowledgeBase.put("database", "Solusi: Cek koneksi pool. Pastikan service MySQL/PostgreSQL running.");
    }

    /**
     * Menghasilkan jawaban berdasarkan input user.
     */
    public String generateResponse(String userInput) {
        // 1. Cek Exact Match atau Contains Keyword
        for (String key : knowledgeBase.keySet()) {
            if (userInput.contains(key)) {
                return knowledgeBase.get(key);
            }
        }

        // 2. Default Response (Fallback jika tidak paham)
        return "Maaf, masalah tidak dikenali. Silakan eskalasi ke Tier 2 Engineer.";
    }
}
