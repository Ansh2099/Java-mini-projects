DRAFT 1 (outline level)
India: I1 WhatsApp order -> Tally/Busy sales order (accept). I2 export doc pack (accept, conditional). I3 NEFT/cheque receipt matching (weak). Rejected: collections reminders, bank entry, 2B recon, e-way bill, CA doc collection.
Europe: E1 email/PDF order -> ERP sales order (accept). E2 supplier order confirmation vs PO (accept, medium). E3 supplier price list update (accept, weak evidence). Rejected: AP invoice capture, bank rec, credit control, trade credit, freight quote, customs, timesheets, MTD doc chase.
Both: order intake. Top pick: order intake Europe non-BC ERPs.

CRITIQUE
1. Draft lists workflows but does not explain WHY some die in 6 months. Need the system map: ledger vendors adding agents (Xero JAX, QBO agents, BC Sales Order + Payables agents), e-invoicing mandates structure invoices not orders, Xero API tiered pricing.
2. Time/volume numbers are estimates, not sourced. Must say so plainly and give a 1 week measurement method so the client's own numbers become the case study.
3. Pricing: user's guess needs a verdict with anchors: OrderDrafter 399 to 799 USD/month SaaS, Conexiom 10k to 100k/yr, UK order processor 21k to 27k GBP. BC agent ~0.165 USD per order at 0.01 USD/credit.
4. India pricing must be tied to Ludhiana salaries 15k to 25k INR; TaxOne 10k INR/yr shows how low price anchors are.
5. Missing: GDPR/transfer to India, WhatsApp Cloud API needs (business must connect number), Tally needs local HTTP port 9000 so a connector runs on client PC.
6. Missing maintenance economics: part time, each ERP adapter is a liability; limit to 2 ERPs; one engine.
7. Sources: WebFetch was blocked; cite only search-found links. Mark knowledge claims as unverified.
8. Remove dash punctuation. Short sentences.
9. E3 evidence is vendor marketing only. Say so. I2 evidence is job ads only. Say so.
10. Size fit per workflow must be explicit.
